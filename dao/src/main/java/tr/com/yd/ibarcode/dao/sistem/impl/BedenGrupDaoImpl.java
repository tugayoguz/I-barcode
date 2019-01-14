package tr.com.yd.ibarcode.dao.sistem.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.sistem.BedenGrupDao;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;


@Repository
public class BedenGrupDaoImpl extends BaseDaoImpl<BedenGrup> implements BedenGrupDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<BedenGrup> getAllBedenGrup() {
		String hql = "select bedenGrup from BedenGrup bedenGrup ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}
	
	@Override
	public BedenGrup findById(Long id) {
		String hql = "select bedenGrup from Beden bedenGrup where bedenGrup.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (BedenGrup) query.uniqueResult();
	}

}
