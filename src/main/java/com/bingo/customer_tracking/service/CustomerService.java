package com.bingo.customer_tracking.service;

import com.bingo.customer_tracking.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomerAll();
    List<Customer> getCustomerAttention(int userId);
}
