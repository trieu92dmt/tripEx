/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.dtos;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TripSearch {
    private int departure;
    private int destination;
    private Date dateTime;

    /**
     * @return the departure
     */
    public int getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(int departure) {
        this.departure = departure;
    }

    /**
     * @return the destination
     */
    public int getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(int destination) {
        this.destination = destination;
    }

    /**
     * @return the dateTime
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
