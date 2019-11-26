
package acme.entities.roles;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;

import acme.framework.entities.UserRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sponsor extends UserRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				organisationName;

	@CreditCardNumber
	private String				cardNumber;

	@NotBlank
	private String				holder;

	@Min(0)
	@Max(999)
	private int					cvv;

	@NotBlank
	private String				brand;

	@Min(1)
	@Max(12)
	private int					expirationMonth;

	private int					expirationYear;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
