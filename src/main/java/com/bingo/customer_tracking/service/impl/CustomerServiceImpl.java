package com.bingo.customer_tracking.service.impl;

import com.bingo.customer_tracking.dao.CustomerDao;
import com.bingo.customer_tracking.entity.Customer;
import com.bingo.customer_tracking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getCustomerAll() {
        return customerDao.quaryCustomers();
    }

    @Override
    public List<Customer> getCustomerAttention(int userId) {
        return customerDao.quaryCustomerAttentions(userId);
    }
}
