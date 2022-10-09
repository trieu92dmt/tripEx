package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Trip;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(Shipment.class)
public class Shipment_ { 

    public static volatile SingularAttribute<Shipment, String> phoneNumber;
    public static volatile SingularAttribute<Shipment, BigInteger> cost;
    public static volatile SingularAttribute<Shipment, String> receiver;
    public static volatile SingularAttribute<Shipment, Date> deliveryTime;
    public static volatile SingularAttribute<Shipment, String> sender;
    public static volatile SingularAttribute<Shipment, Trip> tripId;
    public static volatile SingularAttribute<Shipment, String> email;
    public static volatile SingularAttribute<Shipment, Integer> shipId;
    public static volatile SingularAttribute<Shipment, Integer> status;

}