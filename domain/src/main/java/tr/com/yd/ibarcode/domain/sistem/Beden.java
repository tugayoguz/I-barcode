package tr.com.yd.ibarcode.domain.sistem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tr.com.yd.ibarcode.domain.base.BaseEntity;

@Getter
@Setter
@Table(name="BEDEN")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "BEDEN_SEQ", allocationSize = 1)
public class Beden extends BaseEntity{

	@ManyToOne
	@JoinColumn(name="BEDEN_GRUP_ID")
	private BedenGrup bedenGrup;
	
	@Column(name="ADI")
	private String adi;
	
	@Column(name="KOD",unique=true)
	private String kod;
}
