package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Shipment;
import com.busstationmanager.pojo.Ticket;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Trip.class)
public class Trip_ { 

    public static volatile SingularAttribute<Trip, Date> dateTime;
    public static volatile SingularAttribute<Trip, Integer> finishTime;
    public static volatile SingularAttribute<Trip, Route> route;
    public static volatile SingularAttribute<Trip, BigInteger> ticketPrice;
    public static volatile SetAttribute<Trip, Shipment> shipmentSet;
    public static volatile SetAttribute<Trip, Ticket> ticketSet;
    public static volatile SingularAttribute<Trip, Integer> tripId;
    public static volatile SingularAttribute<Trip, Car> carId;

}