package ku.cs.kafe.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
public class CategoryRequest {

	@NotBlank
	private String name;

}
