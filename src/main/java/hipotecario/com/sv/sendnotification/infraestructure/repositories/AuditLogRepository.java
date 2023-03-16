package hipotecario.com.sv.sendnotification.infraestructure.repositories;

import hipotecario.com.sv.sendnotification.domain.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
