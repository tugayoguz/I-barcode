package tr.com.yd.ibarcode.dao.sistem;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.domain.sistem.Ilce;

public interface IlceDao extends BaseDao<Ilce>{

	List<Ilce> getAllIlce();

	List<Ilce> getIlceByIl(Il il);
	
	Ilce findyById(Long id);
}
