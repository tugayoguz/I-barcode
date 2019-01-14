package tr.com.yd.ibarcode.dao.base.impl;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

/**
 * Created by murat.tugay on 17.07.2017.
 */

public class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T>{

	@Autowired
	private SessionFactory sessionFactory;


	public T insert(T baseEntity) {
		baseEntity.setCreationDate(new Date());
		baseEntity.setDeleted(Boolean.FALSE);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(baseEntity);
		return baseEntity;
	}

	public T update(T baseEntity) {
		baseEntity.setUpdatedDate(new Date());
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(baseEntity);
		return baseEntity;
	}


	public void delete(T baseEntity) {
		baseEntity.setDeleted(Boolean.TRUE);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(baseEntity);
	}

	public List<T> getLazyDataLoad(int first, int pageSize, String sortField, boolean sortOrder, Map<String, Object> filters, Class clazz) {
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(clazz);
		criteria.setFirstResult(first);
		criteria.setMaxResults(pageSize);
		if (sortField != null) {
			if (sortOrder)
				criteria.addOrder(org.hibernate.criterion.Order.asc(sortField));
			else
				criteria.addOrder(org.hibernate.criterion.Order.desc(sortField));
		}
		for (Map.Entry<String, Object> entry : filters.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			criteria.add(Restrictions.like(key, value.toString(), MatchMode.ANYWHERE));
		}
		List<T> list = criteria.list();
		return list;
	}
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
