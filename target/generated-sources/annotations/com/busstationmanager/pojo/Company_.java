package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.Trip;
import com.busstationmanager.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, String> address;
    public static volatile SingularAttribute<Company, String> phoneNumber;
    public static volatile SetAttribute<Company, Car> carSet;
    public static volatile SingularAttribute<Company, String> companyName;
    public static volatile SingularAttribute<Company, Date> expiredDate;
    public static volatile SetAttribute<Company, Trip> tripSet;
    public static volatile SingularAttribute<Company, Integer> userId;
    public static volatile SingularAttribute<Company, User> user;
    public static volatile SingularAttribute<Company, Integer> carLimit;
    public static volatile SingularAttribute<Company, String> email;

}