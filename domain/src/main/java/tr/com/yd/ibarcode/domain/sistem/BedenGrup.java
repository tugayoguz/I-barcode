package tr.com.yd.ibarcode.domain.sistem;

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
@Table(name="BEDEN_GRUP")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "BEDEN_GRUP_SEQ", allocationSize = 1)
public class BedenGrup extends BaseEntity{

	@Column(name="KOD",unique=true)
	private String kod;
	
	@Column(name="ADI")
	private String adi;
	
	@OneToMany(mappedBy="bedenGrup")
	private List<Beden> bedenList;
	
}
