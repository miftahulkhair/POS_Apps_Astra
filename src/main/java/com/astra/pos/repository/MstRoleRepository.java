package com.astra.pos.repository;

import com.astra.pos.model.MstRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MstRoleRepository extends JpaRepository<MstRole, Long> {

}
