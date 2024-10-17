package ku.cs.kafe.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import ku.cs.kafe.validation.ValidPassword;
import lombok.Data;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
public class SignupRequest {

	@NotBlank
	@Size(min = 4, message = "Username must have at least 4 characters")
	private String username;

	@NotBlank
	@ValidPassword
	@Size(min = 8, max = 128, message = "Password must have at least 8 characters")
	private String password;

	@NotBlank(message = "Name is required")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Name only contain letters")
	private String name;
}
