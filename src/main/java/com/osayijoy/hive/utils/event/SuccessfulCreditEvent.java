package com.osayijoy.hive.utils.event;

import com.osayijoy.hive.entity.TransactionLog;
import com.osayijoy.hive.entity.TransactionLog;
import com.osayijoy.hive.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;


@Getter
@Setter
@Builder
public class SuccessfulCreditEvent extends ApplicationEvent {
    private User user;
    private TransactionLog transactionLog;


    public SuccessfulCreditEvent(User user, TransactionLog transactionLog) {
        super(user);
        this.user = user;
        this.transactionLog = transactionLog;
    }
}
