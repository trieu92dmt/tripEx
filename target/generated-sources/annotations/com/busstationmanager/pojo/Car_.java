package com.busstationmanager.pojo;

import com.busstationmanager.pojo.CarType;
import com.busstationmanager.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile SingularAttribute<Car, String> carNumber;
    public static volatile SingularAttribute<Car, Integer> companyId;
    public static volatile SingularAttribute<Car, String> carName;
    public static volatile SetAttribute<Car, Trip> tripSet;
    public static volatile SingularAttribute<Car, CarType> typeId;
    public static volatile SingularAttribute<Car, Integer> carId;

}