package com.smart.windows.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smart.windows.po.Affiliatedfacilitykey;

/**
 * A data access object (DAO) providing persistence and search support for
 * Affiliatedfacilitykey entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.smart.windows.po.Affiliatedfacilitykey
 * @author MyEclipse Persistence Tools
 */
public class AffiliatedfacilitykeyDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory
			.getLog(AffiliatedfacilitykeyDAO.class);
	// property constants
	public static final String STATUS = "status";
	public static final String VALUE = "value";
	public static final String USER0ID = "user0id";
	public static final String USER1ID = "user1id";
	public static final String USER2ID = "user2id";
	public static final String USER3ID = "user3id";
	public static final String USER4ID = "user4id";
	public static final String USER5ID = "user5id";
	public static final String USER6ID = "user6id";
	public static final String USER7ID = "user7id";
	public static final String USER8ID = "user8id";
	public static final String USER9ID = "user9id";

	protected void initDao() {
		// do nothing
	}

	public void save(Affiliatedfacilitykey transientInstance) {
		log.debug("saving Affiliatedfacilitykey instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Affiliatedfacilitykey persistentInstance) {
		log.debug("deleting Affiliatedfacilitykey instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Affiliatedfacilitykey findById(java.lang.Integer id) {
		log.debug("getting Affiliatedfacilitykey instance with id: " + id);
		try {
			Affiliatedfacilitykey instance = (Affiliatedfacilitykey) getHibernateTemplate()
					.get("com.smart.windows.po.Affiliatedfacilitykey", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Affiliatedfacilitykey instance) {
		log.debug("finding Affiliatedfacilitykey instance by example");
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
		log.debug("finding Affiliatedfacilitykey instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Affiliatedfacilitykey as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByValue(Object value) {
		return findByProperty(VALUE, value);
	}

	public List findByUser0id(Object user0id) {
		return findByProperty(USER0ID, user0id);
	}

	public List findByUser1id(Object user1id) {
		return findByProperty(USER1ID, user1id);
	}

	public List findByUser2id(Object user2id) {
		return findByProperty(USER2ID, user2id);
	}

	public List findByUser3id(Object user3id) {
		return findByProperty(USER3ID, user3id);
	}

	public List findByUser4id(Object user4id) {
		return findByProperty(USER4ID, user4id);
	}

	public List findByUser5id(Object user5id) {
		return findByProperty(USER5ID, user5id);
	}

	public List findByUser6id(Object user6id) {
		return findByProperty(USER6ID, user6id);
	}

	public List findByUser7id(Object user7id) {
		return findByProperty(USER7ID, user7id);
	}

	public List findByUser8id(Object user8id) {
		return findByProperty(USER8ID, user8id);
	}

	public List findByUser9id(Object user9id) {
		return findByProperty(USER9ID, user9id);
	}

	public List findAll() {
		log.debug("finding all Affiliatedfacilitykey instances");
		try {
			String queryString = "from Affiliatedfacilitykey";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Affiliatedfacilitykey merge(Affiliatedfacilitykey detachedInstance) {
		log.debug("merging Affiliatedfacilitykey instance");
		try {
			Affiliatedfacilitykey result = (Affiliatedfacilitykey) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Affiliatedfacilitykey instance) {
		log.debug("attaching dirty Affiliatedfacilitykey instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Affiliatedfacilitykey instance) {
		log.debug("attaching clean Affiliatedfacilitykey instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AffiliatedfacilitykeyDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (AffiliatedfacilitykeyDAO) ctx
				.getBean("AffiliatedfacilitykeyDAO");
	}
}