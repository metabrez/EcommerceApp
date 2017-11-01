package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shams on 4/20/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")

    public String home(){

        return "home";
    }
@RequestMapping("/login")
    public String login(@RequestParam(value = "error",required = false)String error,
                        @RequestParam(value = "logout",required = false)String logout,Model model){

if (error!=null){

    model.addAttribute("error","Invalid UserName and Password");
}
           if (logout!=null){
    model.addAttribute("error","You have been logout successfully");
           }

           return "login";
    }
}
