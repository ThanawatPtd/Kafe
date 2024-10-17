package ku.cs.kafe.repository;

import ku.cs.kafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    Member findByUsername(String name);
}
