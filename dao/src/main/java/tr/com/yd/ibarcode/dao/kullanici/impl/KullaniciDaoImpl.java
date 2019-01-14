package tr.com.yd.ibarcode.dao.kullanici.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.kullanici.KullaniciDao;
import tr.com.yd.ibarcode.domain.kullanici.Kullanici;

@Repository
public class KullaniciDaoImpl extends BaseDaoImpl<Kullanici> implements KullaniciDao{

	@Override
	public Kullanici getUserByUserName(String userName) {
		String hql = "select kullanici from Kullanici kullanici where kullanici.kullaniciKodu = :userName";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("userName", userName);
        
        return (Kullanici) query.uniqueResult();
	}

	@Override
	public Kullanici findById(Long id) {
		String hql = "select kullanici from Kullanici kullanici where kullanici.id = :id";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("id", id);
        
        return (Kullanici) query.uniqueResult();
	}
}
