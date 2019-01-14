package tr.com.yd.ibarcode.domain.malzeme;

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
@Table(name="MALZEME_FOTOGRAF")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "MALZEME_FOTOGRAF_SEQ", allocationSize = 1)
public class MalzemeFotograf extends BaseEntity{

	@ManyToOne
	@JoinColumn(name="MALZEME_ID", nullable=false)
	private Malzeme malzeme;
	
	@Column(name="PATH")
	private String path;
	
	@Column(name="VARSAYILAN")
	private boolean varsayilan;
}
