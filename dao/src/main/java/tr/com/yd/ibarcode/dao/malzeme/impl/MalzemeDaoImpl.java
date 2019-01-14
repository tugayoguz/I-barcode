package tr.com.yd.ibarcode.dao.malzeme.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.ibarcode.dao.base.impl.BaseDaoImpl;
import tr.com.yd.ibarcode.dao.malzeme.MalzemeDao;
import tr.com.yd.ibarcode.domain.malzeme.Malzeme;

@Repository
public class MalzemeDaoImpl extends BaseDaoImpl<Malzeme> implements MalzemeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Malzeme> getAllMalzeme() {
		String hql = "select malzeme from Malzeme malzeme ";
        Query query = getSessionFactory().getCurrentSession().createQuery(hql);
        return query.list();
	}

}
