package com.emusicstore.dao;

import com.emusicstore.model.Cart;

import java.io.IOException;

/**
 * Created by shams on 4/2/2017.
 */
public interface CartDao {

    Cart getCartById(int cartId);
    Cart validate(int cartId)throws IOException;
    void update(Cart cart);
}
