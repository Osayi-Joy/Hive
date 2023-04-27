package com.osayijoy.hive.service;

import com.osayijoy.hive.dto.request.UserRegistrationRequestDto;
import com.osayijoy.hive.dto.response.UserRegistrationResponseDto;
import com.osayijoy.hive.entity.User;
import com.osayijoy.hive.entity.VerificationToken;
import com.osayijoy.hive.entity.VerificationToken;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {
    Optional<User> findUserByEmail(String email);

    Optional<User> getUserByPasswordResetToken(String token);

    @Transactional
    UserRegistrationResponseDto registerUser(UserRegistrationRequestDto registrationRequestDto, HttpServletRequest request);

    Boolean validateRegistrationToken(String token);

    String generateVerificationToken(User user);
    VerificationToken generateNewToken(User user);

}
