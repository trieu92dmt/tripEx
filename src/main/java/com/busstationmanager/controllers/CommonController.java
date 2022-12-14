/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.controllers;

import com.busstationmanager.pojo.User;
import com.busstationmanager.service.CompanyService;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Admin
 */
@Controller
@ControllerAdvice
public class CommonController {
    @Autowired
    private CompanyService companyService;
    
    @ModelAttribute
    public void commonAttr(Model model, HttpSession session){
        model.addAttribute("companies", this.companyService.getListCompany());
    }
}
