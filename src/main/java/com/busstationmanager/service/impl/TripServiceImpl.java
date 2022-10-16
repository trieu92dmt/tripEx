/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.service.impl;

import com.busstationmanager.dtos.TripSearch;
import com.busstationmanager.pojo.Province;
import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Station;
import com.busstationmanager.pojo.Trip;
import com.busstationmanager.repository.TripRepository;
import com.busstationmanager.service.TripService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class TripServiceImpl implements TripService{
    @Autowired
    private TripRepository tripRepository;
    
    @Override
    public List<Province> getProvinces() {
        return this.tripRepository.getProvinces();
    }

    @Override
    public List<Trip> getTrips() {
        return this.tripRepository.getTrips();
    }

    @Override
    public boolean addTrip(Trip trip) {
        return this.tripRepository.addTrip(trip);
    }

    @Override
    public List<Station> getStations() {
        return this.tripRepository.getStations();
    }

    @Override
    public Route getRouteByDepartureAndDestination(int dep, int des) {
        return this.tripRepository.getRouteByDepartureAndDestination(dep, des);
    }

    @Override
    public List<Trip> searchTrips(int dep, int des) {
        Route route = this.tripRepository.getRouteByDepartureAndDestination(dep, des);
        return this.tripRepository.searchTrips(route);
    }

    @Override
    public Trip getTripById(int id) {
        return this.tripRepository.getTripById(id);
    }
    
}
