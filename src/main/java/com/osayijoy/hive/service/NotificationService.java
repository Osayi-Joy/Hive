package com.osayijoy.hive.service;

import com.osayijoy.hive.dto.response.NotificationResponseDto;
import com.osayijoy.hive.entity.Task;
import com.osayijoy.hive.entity.User;

import java.util.List;

public interface NotificationService {

    NotificationResponseDto taskCreationNotification(Task task, User user);
    NotificationResponseDto taskAcceptanceNotification(Task task, User user);
    NotificationResponseDto doerAcceptanceNotification(Task task, User user);

    List<NotificationResponseDto> getAllNotificationOfUser(String email);
}
