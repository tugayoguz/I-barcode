package tr.com.yd.ibarcode.dao.sistem.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.sistem.IlceDao;
import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.domain.sistem.Ilce;

@Repository
public class IlceDaoImpl extends BaseDaoImpl<Ilce> implements IlceDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Ilce> getAllIlce() {
		String hql = "select ilce from Ilce ilce ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ilce> getIlceByIl(Il il) {
		String hql = "select ilce from Ilce ilce where ilce.il = :il";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("il", il);
        return query.list();
	}

	@Override
	public Ilce findyById(Long id) {
		String hql = "select ilce from Ilce ilce where ilce.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Ilce) query.uniqueResult();
	}

}
