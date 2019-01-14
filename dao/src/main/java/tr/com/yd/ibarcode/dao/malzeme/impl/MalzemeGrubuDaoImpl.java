package tr.com.yd.ibarcode.dao.malzeme.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.malzeme.MalzemeGrubuDao;
import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;

@Repository
public class MalzemeGrubuDaoImpl extends BaseDaoImpl<MalzemeGrubu> implements MalzemeGrubuDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<MalzemeGrubu> getAllMalzemeGrubu() {
		String hql = "select malzemeGrubu from MalzemeGrubu malzemeGrubu ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

	@Override
	public MalzemeGrubu findById(Long id) {
		String hql = "select malzemeGrubu from MalzemeGrubu malzemeGrubu where malzemeGrubu.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        return (MalzemeGrubu) query.uniqueResult();
	}

}
