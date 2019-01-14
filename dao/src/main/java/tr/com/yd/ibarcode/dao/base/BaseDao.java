package tr.com.yd.ibarcode.dao.base;


import tr.com.yd.ibarcode.domain.base.BaseEntity;


public interface BaseDao<T extends BaseEntity> {

	T insert(T baseEntity);

	T update(T baseEntity);

	void delete(T baseEntity);

}
