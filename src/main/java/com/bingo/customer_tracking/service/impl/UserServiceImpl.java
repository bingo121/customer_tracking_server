package com.bingo.customer_tracking.service.impl;

import com.bingo.customer_tracking.dao.UserDao;
import com.bingo.customer_tracking.dto.UserExecution;
import com.bingo.customer_tracking.entity.User;
import com.bingo.customer_tracking.enums.UserStateEnum;
import com.bingo.customer_tracking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public UserExecution loginVerify(String username, String password) {
        User user = userDao.queryUserByName(username);
        if(user==null){
            return new UserExecution(UserStateEnum.NULL_USER);
        }else if(!user.getUserPassword().equals(password)){
            return new UserExecution(UserStateEnum.PASSWOERD_ERROR);
        }else {
            return new UserExecution(UserStateEnum.SUCESS,user);
        }
    }
}
