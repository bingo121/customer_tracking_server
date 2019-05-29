package com.bingo.customer_tracking.dao;

import com.bingo.customer_tracking.entity.User;

import java.util.List;

public interface UserDao{
    List<User> queryUser();
    User queryUserByName(String userName);
}
