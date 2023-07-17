package com.mcorvera.sendnotification.infraestructure.repositories;

import com.mcorvera.sendnotification.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
