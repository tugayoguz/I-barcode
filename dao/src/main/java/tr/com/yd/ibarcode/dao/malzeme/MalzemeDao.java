package tr.com.yd.ibarcode.dao.malzeme;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.malzeme.Malzeme;


public interface MalzemeDao extends BaseDao<Malzeme>{

	List<Malzeme> getAllMalzeme();
}
