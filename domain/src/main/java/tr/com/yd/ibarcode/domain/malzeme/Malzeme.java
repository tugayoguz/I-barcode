package tr.com.yd.ibarcode.domain.malzeme;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;
import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Table(name="MALZEME")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "MALZEME_SEQ", allocationSize = 1)
public class Malzeme extends BaseEntity {

	@Column(name="ADI", nullable=false)
    private String adi;

	@ManyToOne()
	@JoinColumn(name="MALZEME_GRUBU_ID", nullable=false)
    private MalzemeGrubu malzemeGrubu;

	@Column(name="KOD", unique=true, nullable=false)
	private String kod;
	
	@Column(name="RENK")
	private String renk;
	
	@Column(name="FOTO")
	private String foto;

	@ManyToOne
	@JoinColumn(name="BEDEN_ID")
	private Beden beden;
	
	@ManyToOne
	@JoinColumn(name="BEDEN_GRUP_ID")
	private BedenGrup bedenGrup;
	
	@OneToMany(mappedBy="malzeme")
	private List<MalzemeFotograf> fotografList;
	
	@Column(name="BARCODE")
	private String barcode;
	
	@Column(name="FIRMA_BARCODE")
	private String firmaBarcode;
	
}
