package com.busstationmanager.pojo;

import com.busstationmanager.pojo.CarType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> seatId;
    public static volatile SingularAttribute<Seat, CarType> carTypeId;
    public static volatile SingularAttribute<Seat, String> seatNumber;

}