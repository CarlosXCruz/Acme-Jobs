
package acme.entities.banners;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CommercialBanner extends Banner {

	private static final long	serialVersionUID	= 1L;

	@NotNull
	@Valid
	@OneToOne(optional = false)
	private CreditCard			creditCard;

}
