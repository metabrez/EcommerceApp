package com.emusicstore.service.impl;

import com.emusicstore.dao.CustomerDao;
import com.emusicstore.model.Customer;
import com.emusicstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shams on 4/23/2017.
 */
@Service

public class CustomerServiceImpl implements CustomerService {

@Autowired
public CustomerDao customerDao;
    @Override
    public void addCustomer(Customer customer) {

        customerDao.addCustomer(customer);

    }

    @Override
    public Customer getCustomerById(int customerId) {

        return customerDao.getCustomerById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    @Override
    public  Customer getCustomerByUsername(String username){

      return customerDao.getCustomerByUsername(username);
    }
}
