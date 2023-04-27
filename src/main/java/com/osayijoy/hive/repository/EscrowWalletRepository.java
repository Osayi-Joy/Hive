package com.osayijoy.hive.repository;

import com.osayijoy.hive.entity.EscrowWallet;
import com.osayijoy.hive.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscrowWalletRepository extends JpaRepository<EscrowWallet, String > {
    void deleteByTask(Task task);
}
