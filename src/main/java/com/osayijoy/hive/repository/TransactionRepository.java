package com.osayijoy.hive.repository;

import com.osayijoy.hive.entity.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionLog, String> {
}
