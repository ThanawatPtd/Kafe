package ku.cs.kafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.UUID;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;
    private String password;
    private String name;
    private String role;
}
