package tr.com.yd.ibarcode.domain.satis;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

@Getter
@Setter
//@Entity
//@Table(name="SATIS")
//@SequenceGenerator(name = "seqGenerator", sequenceName = "SATIS_SEQ", allocationSize = 1)
public class Satis extends BaseEntity{

	//@Column(name="SATIS_TARIHI")
	private Date satisTarihi;
	
	//@Column(name="FIS_NO")
	private String fisNo;
	
	//@OneToMany
	private List<SatisDetay> satisDetayList;
}
