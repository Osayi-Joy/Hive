package com.osayijoy.hive.repository;

import com.osayijoy.hive.entity.User;
import com.osayijoy.hive.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    Optional<VerificationToken> findByUser(User user);
}
