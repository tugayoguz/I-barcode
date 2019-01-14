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

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Entity
@Table(name="ILCE")
@SequenceGenerator(name = "seqGenerator", sequenceName = "ILCE_SEQ", allocationSize = 1)
public class Ilce  extends BaseEntity{

	@ManyToOne
	@JoinColumn(name = "IL_ID")
    private Il il;

	@Column(name="AD")
    private String ad;

	@Column(name="KOD")
    private String kod;
}
