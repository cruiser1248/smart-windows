package com.smart.windows.dao;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smart.windows.po.Mainfacility;

/**
 * A data access object (DAO) providing persistence and search support for
 * Mainfacility entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.smart.windows.po.Mainfacility
 * @author MyEclipse Persistence Tools
 */
public class MainfacilityDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MainfacilityDAO.class);
	// property constants
	public static final String PHYSICAL_ID = "physicalId";
	public static final String NAME = "name";
	public static final String STATUS = "status";

	protected void initDao() {
		// do nothing
	}

	public void save(Mainfacility transientInstance) {
		log.debug("saving Mainfacility instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Mainfacility persistentInstance) {
		log.debug("deleting Mainfacility instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Mainfacility findById(java.lang.Integer id) {
		log.debug("getting Mainfacility instance with id: " + id);
		try {
			Mainfacility instance = (Mainfacility) getHibernateTemplate().get(
					"com.smart.windows.po.Mainfacility", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Mainfacility instance) {
		log.debug("finding Mainfacility instance by example");
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
		log.debug("finding Mainfacility instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Mainfacility as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhysicalId(Object physicalId) {
		return findByProperty(PHYSICAL_ID, physicalId);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Mainfacility instances");
		try {
			String queryString = "from Mainfacility";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Mainfacility merge(Mainfacility detachedInstance) {
		log.debug("merging Mainfacility instance");
		try {
			Mainfacility result = (Mainfacility) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Mainfacility instance) {
		log.debug("attaching dirty Mainfacility instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Mainfacility instance) {
		log.debug("attaching clean Mainfacility instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MainfacilityDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (MainfacilityDAO) ctx.getBean("MainfacilityDAO");
	}
}