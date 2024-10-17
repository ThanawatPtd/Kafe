package ku.cs.kafe.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Data
@Entity
public class OrderItem {

    @EmbeddedId
    private OrderItemKey id;

    private int quantity;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public double getSubtotal() {
        return menu.getPrice() * quantity;
    }
}
