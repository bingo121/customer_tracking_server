package com.bingo.customer_tracking.web;


import com.bingo.customer_tracking.service.CustomerService;
import com.bingo.customer_tracking.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> getCusomters(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        int userId = HttpServletRequestUtil.getInt(request, "user_id");
        modelMap.put("attention", customerService.getCustomerAttention(userId));
        modelMap.put("customers",customerService.getCustomerAll());

        return modelMap;
    }
}
