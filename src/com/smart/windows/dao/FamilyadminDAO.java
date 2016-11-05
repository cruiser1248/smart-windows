package com.smart.windows.dao;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smart.windows.po.Familyadmin;

/**
 * A data access object (DAO) providing persistence and search support for
 * Familyadmin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.smart.windows.po.Familyadmin
 * @author MyEclipse Persistence Tools
 */
public class FamilyadminDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FamilyadminDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String PWD = "pwd";
	public static final String STATUS = "status";
	public static final String SEX = "sex";
	public static final String EMIL = "emil";
	public static final String TEL = "tel";
	public static final String FAMILY_ADDRESS = "familyAddress";

	protected void initDao() {
		// do nothing
	}

	public void save(Familyadmin transientInstance) {
		log.debug("saving Familyadmin instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Familyadmin persistentInstance) {
		log.debug("deleting Familyadmin instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Familyadmin findById(java.lang.Integer id) {
		log.debug("getting Familyadmin instance with id: " + id);
		try {
			Familyadmin instance = (Familyadmin) getHibernateTemplate().get(
					"com.smart.windows.po.Familyadmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Familyadmin instance) {
		log.debug("finding Familyadmin instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Familyadmin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Familyadmin as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByEmil(Object emil) {
		return findByProperty(EMIL, emil);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findByFamilyAddress(Object familyAddress) {
		return findByProperty(FAMILY_ADDRESS, familyAddress);
	}

	public List findAll() {
		log.debug("finding all Familyadmin instances");
		try {
			String queryString = "from Familyadmin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Familyadmin merge(Familyadmin detachedInstance) {
		log.debug("merging Familyadmin instance");
		try {
			Familyadmin result = (Familyadmin) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Familyadmin instance) {
		log.debug("attaching dirty Familyadmin instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Familyadmin instance) {
		log.debug("attaching clean Familyadmin instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FamilyadminDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (FamilyadminDAO) ctx.getBean("FamilyadminDAO");
	}
}