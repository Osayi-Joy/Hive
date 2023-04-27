package com.osayijoy.hive.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationResponseDto {

    private String userId;

    private String title;

    private String body;

    private String createdAt;

    private String elapsedTime;

}
