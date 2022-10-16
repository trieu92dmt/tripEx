/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.controllers;

import com.busstationmanager.dtos.CompanyRegister;
import com.busstationmanager.dtos.TripCreate;
import com.busstationmanager.dtos.TripSearch;
import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Trip;
import com.busstationmanager.pojo.User;
import com.busstationmanager.service.CompanyService;
import com.busstationmanager.service.PackageService;
import com.busstationmanager.service.TripService;
import com.busstationmanager.service.UserService;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Autowired
    private TripService tripService;
    
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
    
    
    @GetMapping("/manager/trip")
    public String tripManager(Model model, HttpSession session, @RequestParam(required = false) Map<String, String> params){        
        User user = (User)session.getAttribute("currentUser");
                
        if (user == null)   
            return "redirect:/"; 
        //
        int dep = Integer.parseInt(params.getOrDefault("dep", "0"));
        int des = Integer.parseInt(params.getOrDefault("des", "0"));
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String date = params.getOrDefault("date", null);
        if (dep == 0 || des == 0 || date == null){
            model.addAttribute("trips", this.tripService.getTrips());
        }
        else{
            List<Trip> list = this.tripService.searchTrips(dep, des);
            List<Trip> result = new ArrayList<>();
                for (Trip item : list){
                    Timestamp ts = new Timestamp(item.getDateTime().getTime());
                    if (fmt.format(ts).equals(date))
                        result.add(item);
                }
            model.addAttribute("trips", result);
        }
        
        model.addAttribute("cars", this.companyService.getCarByCompanyId(user.getUserId()));
        model.addAttribute("provinces", this.tripService.getProvinces());
        model.addAttribute("stations", this.tripService.getStations());
        model.addAttribute("tripCreate", new TripCreate());
        
        return "company-trip-manager";
    }   
    
    @PostMapping(value = "/trip/create")
    public String createTrip(@ModelAttribute(value = "tripCreate") TripCreate tripCreate, HttpSession session){
        User user = (User)session.getAttribute("currentUser");
        
        Trip trip = new Trip();
        trip.setCarId(tripCreate.getCarId());
        trip.setDateTime(tripCreate.getDateTime());
        trip.setFinishTime(tripCreate.getFinishTime());
        trip.setTicketPrice(tripCreate.getTicketPrice());
        trip.setCompanyId(user.getCompany());
        trip.setFromStation(tripCreate.getFromStation());
        trip.setToStation(tripCreate.getToStation());
        trip.setRoute(this.tripService.getRouteByDepartureAndDestination(tripCreate.getDeparture(), tripCreate.getDestination()));
        
        if (tripService.addTrip(trip))
            return "redirect:/company/manager/trip";
        
        return "redirect:/";
    }
    
    @GetMapping("/extend")
    public String extend(Model model){
        model.addAttribute("packages", this.packageService.getPackages());
        return "company-extend";
    }
    
    @GetMapping("/revenue-stat")
    public String statRevenue(Model model){
        return "company-revenue-manager";
    }
    
    @GetMapping("/frequency-stat")
    public String statFrequency(Model model){
        return "company-frequency-manager";
    }
}
