package com.osayijoy.hive.repository;

import com.osayijoy.hive.entity.Notification;
import com.osayijoy.hive.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, String> {

    List<Notification> findNotificationsByUserOrderByCreatedAtDesc(User user);
}

