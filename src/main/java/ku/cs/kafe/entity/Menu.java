package ku.cs.kafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;

    @ManyToOne
    private Category category;
}
