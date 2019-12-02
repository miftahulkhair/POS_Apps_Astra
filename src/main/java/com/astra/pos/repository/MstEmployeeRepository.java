package com.astra.pos.repository;

import com.astra.pos.model.MstEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MstEmployeeRepository extends JpaRepository<MstEmployee, Long> {
}
