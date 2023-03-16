package hipotecario.com.sv.sendnotification.infraestructure.repositories;

import hipotecario.com.sv.sendnotification.domain.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {
}
