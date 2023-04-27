package com.osayijoy.hive.repository;

import com.osayijoy.hive.entity.User;
import com.osayijoy.hive.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, String> {

    Optional<Wallet> findByUser(User user);

}
