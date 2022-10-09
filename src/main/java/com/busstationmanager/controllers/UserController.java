/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.controllers;

import com.busstationmanager.pojo.User;
import com.busstationmanager.service.UserService;
import com.busstationmanager.dtos.CustomerRegister;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
@Controller
public class UserController {
    @Autowired
    private UserService userDetailsService;
    
    @GetMapping(value = "/login")
    public String login(HttpSession session) {
        if (session.getAttribute("currentUser") != null)
            return "redirect:/";    
        return "login";
    }
    @GetMapping(value = "/register")
    public String registerView(Model model) {
        model.addAttribute("customer", new CustomerRegister());
        return "register";
    }
    
    @PostMapping(value = "/register")
    public String register(@ModelAttribute(value = "customer") CustomerRegister cus){
        if (userDetailsService.addUserCustomer(cus.getUser(), cus.getCustomer()))
            return "redirect:/login";
        return "register";
    }
}
