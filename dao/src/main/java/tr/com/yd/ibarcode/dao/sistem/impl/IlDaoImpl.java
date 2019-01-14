package tr.com.yd.ibarcode.dao.sistem.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.sistem.IlDao;
import tr.com.yd.ibarcode.domain.sistem.Il;

@Repository
public class IlDaoImpl extends BaseDaoImpl<Il> implements IlDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Il> getAllIl() {
		String hql = "select il from Il il ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

	@Override
	public Il findById(Long id) {
		String hql = "select il from Il il where il.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Il) query.uniqueResult();
	}

}
