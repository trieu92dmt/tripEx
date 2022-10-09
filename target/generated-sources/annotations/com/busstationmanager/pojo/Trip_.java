package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Station;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(Trip.class)
public class Trip_ { 

    public static volatile SingularAttribute<Trip, Date> dateTime;
    public static volatile SingularAttribute<Trip, Station> toStation;
    public static volatile SingularAttribute<Trip, Integer> finishTime;
    public static volatile SingularAttribute<Trip, Company> companyId;
    public static volatile SingularAttribute<Trip, Route> route;
    public static volatile SingularAttribute<Trip, BigInteger> ticketPrice;
    public static volatile SingularAttribute<Trip, Integer> tripId;
    public static volatile SingularAttribute<Trip, Station> fromStation;
    public static volatile SingularAttribute<Trip, Car> carId;

}