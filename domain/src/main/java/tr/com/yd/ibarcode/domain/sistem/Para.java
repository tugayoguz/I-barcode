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
@Table(name="PARA")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "PARA_SEQ", allocationSize = 1)
public class Para extends BaseEntity{
	
	@Column(name="KOD", unique=true, nullable=false)
	private String kod;
	
	@Column(name="AD",nullable=false)
	private String ad;
	
	@OneToMany(mappedBy="para")
	private List<Kur> kurList;
	
}
