package com.bingo.customer_tracking.web;


import com.bingo.customer_tracking.dto.UserExecution;
import com.bingo.customer_tracking.entity.User;
import com.bingo.customer_tracking.enums.UserStateEnum;
import com.bingo.customer_tracking.service.UserService;
import com.bingo.customer_tracking.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listUser() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<User> userList = new ArrayList<User>();
        try {
            userList = userService.getUserList();
            modelMap.put("row", userList);
            modelMap.put("total", userList.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }


        return modelMap;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> Login(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        String userName = HttpServletRequestUtil.getString(request, "username");
        String password = HttpServletRequestUtil.getString(request, "password");

        UserExecution userExecution = userService.loginVerify(userName, password);
        if (userExecution.getUserStateEnum() == UserStateEnum.SUCESS) {
            modelMap.put("success", true);
            modelMap.put("user", userExecution.getUser());
        } else {
            modelMap.put("success", false);
            modelMap.put("reason", userExecution.getUserStateEnum().getStateInfo());
        }

        return modelMap;
    }
}
