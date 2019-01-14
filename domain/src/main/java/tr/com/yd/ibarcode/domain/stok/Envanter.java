package tr.com.yd.ibarcode.domain.stok;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;
import tr.com.yd.ibarcode.domain.hareket.StokGiris;
import tr.com.yd.ibarcode.domain.hareket.StokGirisDetay;
import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.domain.sistem.Para;

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Table(name="ENVANTER")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "ENVANTER_SEQ", allocationSize = 1)
public class Envanter extends BaseEntity {

	@ManyToOne
	@JoinColumn(name="MALZEME_ID", nullable=false)
	private Malzeme malzeme;
	
	@Column(name="MIKTAR")
	private BigDecimal miktar;
	
	@ManyToOne
	@JoinColumn(name="PARA_ID", nullable=false)
	private Para satisParaBirim;
	
	@Column(name="SATIS_FIYATI")
	private BigDecimal satisFiyat;
	
	@ManyToOne
	@JoinColumn(name="STOK_GIRIS_DETAY_ID")
	private StokGirisDetay stokGirisDetay;
	
	@Column(name="KALAN_MIKTAR")
	private BigDecimal kalanMiktar;
	
	@Transient
	private BigDecimal digerSatisFiyati;
	
}
