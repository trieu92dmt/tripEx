/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.dtos;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Station;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class TripCreate {
    private int departure;
    private int destination;
    private Station fromStation;
    private Station toStation;
    private Date dateTime;
    private BigInteger ticketPrice;
    private Integer finishTime;
    private Car carId;

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
     * @return the fromStation
     */
    public Station getFromStation() {
        return fromStation;
    }

    /**
     * @param fromStation the fromStation to set
     */
    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    /**
     * @return the toStation
     */
    public Station getToStation() {
        return toStation;
    }

    /**
     * @param toStation the toStation to set
     */
    public void setToStation(Station toStation) {
        this.toStation = toStation;
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

    /**
     * @return the ticketPrice
     */
    public BigInteger getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    public void setTicketPrice(BigInteger ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * @return the finishTime
     */
    public Integer getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime the finishTime to set
     */
    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * @return the carId
     */
    public Car getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(Car carId) {
        this.carId = carId;
    }
}
