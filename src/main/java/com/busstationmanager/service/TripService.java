/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.busstationmanager.service;

import com.busstationmanager.dtos.TripSearch;
import com.busstationmanager.pojo.Province;
import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Station;
import com.busstationmanager.pojo.Trip;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TripService {
    List<Province> getProvinces();
    List<Station> getStations();
    List<Trip> getTrips();
    Trip getTripById(int id);
    boolean addTrip(Trip trip);
    Route getRouteByDepartureAndDestination(int dep, int des);
    List<Trip> searchTrips(int dep, int des);
}
