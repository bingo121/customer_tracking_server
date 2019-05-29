package com.bingo.customer_tracking.service;

import com.bingo.customer_tracking.dto.UserExecution;
import com.bingo.customer_tracking.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    UserExecution loginVerify(String username,String password);
}
