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

/**
 * Created by PC-D69 on 23.09.2018.
 */
@Getter
@Setter
@Table(name="IL")
@Entity
@SequenceGenerator(name = "seqGenerator", sequenceName = "IL_SEQ", allocationSize = 1)
public class Il extends BaseEntity {

	@Column(name="AD")
    private String ad;

	@Column(name="KOD")
    private String kod;

	@OneToMany(mappedBy="il")
    private List<Ilce> ilceList;

}
