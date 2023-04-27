package com.osayijoy.hive.utils.event;

import com.osayijoy.hive.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
@Builder
public class RegistrationCompleteEvent extends ApplicationEvent {
    private User user;
    private String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}

