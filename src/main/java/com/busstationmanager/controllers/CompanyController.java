/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.controllers;

import com.busstationmanager.dtos.CompanyRegister;
import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.User;
import com.busstationmanager.service.CompanyService;
import com.busstationmanager.service.PackageService;
import com.busstationmanager.service.UserService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private UserService userDetailsService;
    @Autowired
    private PackageService packageService;
    @Autowired
    private CompanyService companyService;
    
    @GetMapping("/list")
    public String list(){
        return "list-company";
    }
    
    @GetMapping("/register")
    public String registerView(Model model){
        model.addAttribute("packages", this.packageService.getPackages());
        model.addAttribute("companyRegister", new CompanyRegister());
        return "company-register";
    }
    
    @PostMapping("/register")
    public String register(@ModelAttribute(value = "companyRegister") CompanyRegister com){
        userDetailsService.addUserCompany(com.getUser(), com.getCompany(), com.getPackageId());
        return "redirect:/home";
    }
    
    @GetMapping("/details")
    public String details(){
        return "company-details";
    }
    
    @GetMapping("/manager/details")
    public String detailsManager(Model model){
        model.addAttribute("company", new Company());
        return "company-details-manager";
    }   
    
    @PostMapping(value = "/details/update")
    public String updateDetailsCompany(@ModelAttribute(value = "company") Company com, HttpSession session){
        User user = (User)session.getAttribute("currentUser");
                
        if (user == null)   
            return "redirect:/";   
        
        user.getCompany().setCompanyName(com.getCompanyName());
        user.getCompany().setAddress(com.getAddress());
        user.getCompany().setEmail(com.getEmail());
        user.getCompany().setPhoneNumber(com.getPhoneNumber());
        
        if (companyService.UpdateCompany(user))
            return "redirect:/company/manager/details";
        
        return "redirect:/";
    }
    
    @GetMapping("/manager/car")
    public String carManager(Model model, HttpSession session){
        User user = (User)session.getAttribute("currentUser");
                
        if (user == null)   
            return "redirect:/"; 
        
        model.addAttribute("car", new Car());
        model.addAttribute("cars", this.companyService.getCarByCompanyId(user.getUserId()));
        model.addAttribute("carTypes", this.companyService.getCarTypes());
        
        return "company-car-manager";
    }   
    
    
    @PostMapping(value = "/car/create")
    public String createCar(@ModelAttribute(value = "car") Car car, HttpSession session){
        User user = (User)session.getAttribute("currentUser");
                
        if (user == null)   
            return "redirect:/";   
        
        car.setCompanyId(user.getCompany());
        
        if (companyService.addCar(car))
            return "redirect:/company/manager/car";
        
        return "redirect:/";
    }
    
    @PostMapping(value = "/car/update")
    public String updateCar(@ModelAttribute(value = "car") Car car, HttpSession session){
        
        Car carUpdate = this.companyService.getCar(car.getCarId());
        carUpdate.setTypeId(car.getTypeId());
        carUpdate.setCarNumber(car.getCarNumber());
        
        if (companyService.updateCar(carUpdate))
            return "redirect:/company/manager/car";
        
        return "redirect:/";
    }
    
    @PostMapping(value = "/car/delete/{id}")
    public String deleteCar(@PathVariable(value = "id") int id){
        
        if (companyService.deleteCar(id))
            return "redirect:/company/manager/car";
        
        return "redirect:/";
    }
}
