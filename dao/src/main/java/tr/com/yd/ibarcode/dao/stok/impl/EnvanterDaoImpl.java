package tr.com.yd.ibarcode.dao.stok.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.stok.EnvanterDao;
import tr.com.yd.ibarcode.domain.stok.Envanter;

@Repository
public class EnvanterDaoImpl extends BaseDaoImpl<Envanter> implements EnvanterDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Envanter> getAllEnvanter() {
		String hql = "select envanter from Envanter envanter ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

	@Override
	public Envanter findById(Long id) {
		String hql = "select envanter from Envanter envanter where envanter.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (Envanter) query.uniqueResult();
	}

	@Override
	public Envanter findByBarcode(String barcode) {
		String hql = "select envanter from Envanter envanter where envanter.malzeme.firmaBarcode = :firmaBarcode or envanter.malzeme.barcode = :barcode";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("firmaBarcode", barcode);
        query.setParameter("barcode", barcode);
        return (Envanter) query.uniqueResult();
	}
	

}
