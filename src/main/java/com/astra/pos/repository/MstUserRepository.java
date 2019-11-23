package com.astra.pos.repository;

import com.astra.pos.model.MstUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MstUserRepository extends JpaRepository<MstUser, Long> {
}
