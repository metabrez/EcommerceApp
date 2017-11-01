package com.emusicstore.service;

import com.emusicstore.model.Cart;

/**
 * Created by shams on 4/23/2017.
 */
public interface CartService {

    Cart getCartById(int cartId);
    void update(Cart cart);
}
