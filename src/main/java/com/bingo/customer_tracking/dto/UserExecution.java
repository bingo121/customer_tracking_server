package com.bingo.customer_tracking.dto;

import com.bingo.customer_tracking.entity.User;
import com.bingo.customer_tracking.enums.UserStateEnum;

public class UserExecution {
    private UserStateEnum userStateEnum;
    private User user;

    public UserExecution() {
    }

    public UserExecution(UserStateEnum userStateEnum) {
        this.userStateEnum = userStateEnum;
    }

    public UserExecution(UserStateEnum userStateEnum, User user) {
        this.userStateEnum = userStateEnum;
        this.user = user;
    }

    public UserStateEnum getUserStateEnum() {
        return userStateEnum;
    }

    public User getUser() {
        return user;
    }
}
