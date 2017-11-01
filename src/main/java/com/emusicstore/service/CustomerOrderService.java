package com.emusicstore.service;

import com.emusicstore.model.CustomerOrder;

/**
 * Created by shams on 4/26/2017.
 */
public interface CustomerOrderService {


    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);


}
