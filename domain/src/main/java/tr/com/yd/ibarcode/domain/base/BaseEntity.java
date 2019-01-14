package tr.com.yd.ibarcode.domain.base;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenerator")
	private Long id;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name="CREATED_USER_ID")
	private Long createdUserId;
	
	@Column(name="UPDATED_USER_ID")
	private Long updatedUserId;
	
	@Column(name="DELETED")
	private Boolean deleted;

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return obj instanceof BaseEntity ? ((BaseEntity)obj).id == this.id : false;
	}
	
	

}