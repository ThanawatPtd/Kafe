package ku.cs.kafe.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
public class MenuRequest {

	@NotBlank
	private String name;
	@NotBlank
	private String categoryName;
	@Positive
	private double price;
}
