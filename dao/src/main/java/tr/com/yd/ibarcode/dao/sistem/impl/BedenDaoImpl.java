package tr.com.yd.ibarcode.dao.sistem.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.sistem.BedenDao;
import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;

@Repository
public class BedenDaoImpl extends BaseDaoImpl<Beden> implements BedenDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Beden> getAllBeden() {
		String hql = "select beden from Beden beden ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Beden> getBedenByBedenGrupId(BedenGrup bedenGrup) {
		String hql = "select beden from Beden beden where beden.bedenGrup = :bedenGrup ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("bedenGrup", bedenGrup);
        return query.list();
	}

	@Override
	public Beden findById(Long id) {
		String hql = "select beden from Beden beden where beden.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Beden) query.uniqueResult();
	}

}
