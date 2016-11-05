package com.smart.windows.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smart.windows.po.Familyuser;

/**
 * A data access object (DAO) providing persistence and search support for
 * Familyuser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.smart.windows.po.Familyuser
 * @author MyEclipse Persistence Tools
 */
public class FamilyuserDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FamilyuserDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String STATUS = "status";
	public static final String PWD = "pwd";

	protected void initDao() {
		// do nothing
	}

	public void save(Familyuser transientInstance) {
		log.debug("saving Familyuser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Familyuser persistentInstance) {
		log.debug("deleting Familyuser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Familyuser findById(java.lang.Integer id) {
		log.debug("getting Familyuser instance with id: " + id);
		try {
			Familyuser instance = (Familyuser) getHibernateTemplate().get(
					"com.smart.windows.po.Familyuser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Familyuser instance) {
		log.debug("finding Familyuser instance by example");
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
		log.debug("finding Familyuser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Familyuser as model where model."
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

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findAll() {
		log.debug("finding all Familyuser instances");
		try {
			String queryString = "from Familyuser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Familyuser merge(Familyuser detachedInstance) {
		log.debug("merging Familyuser instance");
		try {
			Familyuser result = (Familyuser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Familyuser instance) {
		log.debug("attaching dirty Familyuser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Familyuser instance) {
		log.debug("attaching clean Familyuser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FamilyuserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FamilyuserDAO) ctx.getBean("FamilyuserDAO");
	}
}