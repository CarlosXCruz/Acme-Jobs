
package acme.entities.jobs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.roles.Employer;
import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Job extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(min = 5, max = 10)
	@Pattern(regexp = "^[a-zA-Z]{4}-[a-zA-Z]{4}$")
	@Column(unique = true)
	private String				referenceNumber;

	@NotBlank
	private String				status;

	@NotBlank
	private String				title;

	@NotNull
	private Date				deadline;

	@NotNull
	@Valid
	private Money				salary;

	@URL
	private String				moreInfo;

	@NotNull
	@OneToOne(optional = false)
	@Valid
	private Descriptor			descriptor;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Employer			employer;

}
