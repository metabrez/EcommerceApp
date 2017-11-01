package com.emusicstore.controller;

import com.emusicstore.model.Customer;
import com.emusicstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shams on 4/23/2017.
 */
@Controller
@RequestMapping(value="/customer/cart")
public class CartController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("")
    public String getCart(){
        User activeUser = getLoggedInUser();
        Customer customer=customerService.getCustomerByUsername(activeUser.getUsername());
        int cartId=customer.getCart().getCartId();

        return "redirect:/customer/cart/"+cartId;

    }
    @RequestMapping("/{cartId}")
      public String getCartRedirect(@PathVariable(value = "cartId")int cartId, Model model){

        model.addAttribute("cartId",cartId);

        return "cart";
      }

      public User getLoggedInUser(){
          Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
          User user = (User) authentication.getPrincipal();
          return user;
      }
}
