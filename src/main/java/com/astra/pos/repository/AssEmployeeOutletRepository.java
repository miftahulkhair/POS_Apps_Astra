package com.astra.pos.repository;

import com.astra.pos.model.AssEmployeeOutlet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssEmployeeOutletRepository extends JpaRepository<AssEmployeeOutlet, Long> {
}
