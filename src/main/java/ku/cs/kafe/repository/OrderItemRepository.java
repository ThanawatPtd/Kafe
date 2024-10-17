package ku.cs.kafe.repository;

import ku.cs.kafe.entity.OrderItem;
import ku.cs.kafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Repository
public interface OrderItemRepository
                extends JpaRepository<OrderItem, OrderItemKey> {
}
