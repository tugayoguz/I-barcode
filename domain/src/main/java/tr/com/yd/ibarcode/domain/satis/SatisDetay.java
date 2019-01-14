package tr.com.yd.ibarcode.domain.satis;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;
import tr.com.yd.ibarcode.domain.sistem.Para;
import tr.com.yd.ibarcode.domain.stok.Envanter;

@Getter
@Setter
//@Entity
//@Table(name="SATIS_DETAY")
//@SequenceGenerator(name = "seqGenerator", sequenceName = "SATIS_DETAY_SEQ", allocationSize = 1)
public class SatisDetay extends BaseEntity{
	
	//@ManyToOne
	//@JoinColumn(name="SATIS_ID", nullable=false)
	private Satis satis;
	
	//@ManyToOne
	//@JoinColumn(name="ENVANTER_ID", nullable=false)
	private Envanter envanter;
	
	//@Column(name="SATIS_FIYATI", nullable=false)
	private BigDecimal satisFiyati;
	
	//@Column(name="SATIS_PARA_BIRIMI", nullable=false)
	private Para satisParaBirimi;
	

}
