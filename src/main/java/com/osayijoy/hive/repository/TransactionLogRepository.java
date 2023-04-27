package com.osayijoy.hive.repository;

import com.osayijoy.hive.constant.TransactionStatus;
import com.osayijoy.hive.entity.TransactionLog;
import com.osayijoy.hive.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, String> {
    List<TransactionLog> findAllByUserAndTransactionStatus(User user, TransactionStatus transactionStatus);
}
