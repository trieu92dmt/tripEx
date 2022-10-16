/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.controllers;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Trip;
import com.busstationmanager.service.CompanyService;
import com.busstationmanager.service.TripService;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TripService tripService;
    
    @GetMapping(path = "/car/get/{carId}", produces = {
        MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Car> getCarById(@PathVariable(value = "carId") int carId) {
        try {
            Car car = this.companyService.getCar(carId);
            return new ResponseEntity<>(car, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
        
    
    @GetMapping(value = "/trip/search")
    public ResponseEntity<List<Trip>> searchTrip(@RequestParam Map<String, String> params){
        try{
            int dep = Integer.parseInt(params.get("departure"));
            int des = Integer.parseInt(params.get("destination"));
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            String date = params.getOrDefault("date", null);
            List<Trip> list = this.tripService.searchTrips(dep, des);
            if (date == null)
            {
                return new ResponseEntity<>(list, HttpStatus.CREATED);
            }
            else{
                List<Trip> result = new ArrayList<>();
                for (Trip item : list){
                    Timestamp ts = new Timestamp(item.getDateTime().getTime());
                    if (fmt.format(ts).equals(date))
                        result.add(item);
                }
                return new ResponseEntity<>(result, HttpStatus.CREATED);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
    @GetMapping(value = "/trip/get/{id}", produces = {
        MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Trip> getTripById(@PathVariable(value = "id") int id) {
        try {
            Trip trip = this.tripService.getTripById(id);
            return new ResponseEntity<>(trip, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    
}
