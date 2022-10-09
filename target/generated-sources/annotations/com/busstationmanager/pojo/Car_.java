package com.busstationmanager.pojo;

import com.busstationmanager.pojo.CarType;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(Car.class)
public class Car_ { 

    public static volatile SingularAttribute<Car, String> carNumber;
    public static volatile SingularAttribute<Car, Company> companyId;
    public static volatile SingularAttribute<Car, String> carName;
    public static volatile SetAttribute<Car, Trip> tripSet;
    public static volatile SingularAttribute<Car, CarType> typeId;
    public static volatile SingularAttribute<Car, Integer> carId;

}