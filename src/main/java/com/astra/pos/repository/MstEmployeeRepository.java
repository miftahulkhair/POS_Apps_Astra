package com.astra.pos.repository;

import com.astra.pos.model.MstEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MstEmployeeRepository extends JpaRepository<MstEmployee, Long> {
}
