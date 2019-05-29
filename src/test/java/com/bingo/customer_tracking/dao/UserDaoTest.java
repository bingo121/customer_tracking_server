package com.bingo.customer_tracking.dao;

import com.bingo.customer_tracking.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.bingo.customer_tracking.entity.User;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testQueryUser() {
        List<User> userList = userDao.queryUser();
        assertEquals(2, userList.size());
    }
}
