package com.bingo.customer_tracking.dao;

import com.bingo.customer_tracking.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDao {
    List<Customer> quaryCustomers();
    List<Customer> quaryCustomerAttentions(@Param("useId") int useId);
    int insertCustomer(Customer customer);
    int updateCustomer(Customer customer);
}
