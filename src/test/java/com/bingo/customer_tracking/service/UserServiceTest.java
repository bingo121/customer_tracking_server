package com.bingo.customer_tracking.service;

import com.bingo.customer_tracking.BaseTest;
import com.bingo.customer_tracking.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetAreaList(){
        List<User> userList = userService.getUserList();
        assertEquals("sxbingo",userList.get(1).getUserName());
    }
}
