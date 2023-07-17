package com.mcorvera.sendnotification.infraestructure.repositories;

import com.mcorvera.sendnotification.domain.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Long> {
}
