package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Seat;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(CarType.class)
public class CarType_ { 

    public static volatile SetAttribute<CarType, Car> carSet;
    public static volatile SingularAttribute<CarType, String> typeName;
    public static volatile SingularAttribute<CarType, Integer> seatTotal;
    public static volatile SingularAttribute<CarType, Integer> typeId;
    public static volatile SetAttribute<CarType, Seat> seatSet;

}