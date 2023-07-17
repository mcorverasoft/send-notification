package com.mcorvera.sendnotification.infraestructure.repositories;

import com.mcorvera.sendnotification.domain.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
