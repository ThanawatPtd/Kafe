package ku.cs.kafe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import ku.cs.kafe.common.Status;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
@Entity
public class PurchaseOrder {
    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime timestamp;
    private Status status;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<OrderItem> items = new ArrayList<>();

    public double getTotal() {
        double total = 0;
        for (OrderItem item : items)
            total += item.getSubtotal();
        return total;
    }
}
