package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Province;
import com.busstationmanager.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, Province> proviceId;
    public static volatile SingularAttribute<Station, String> address;
    public static volatile SetAttribute<Station, Trip> tripSet1;
    public static volatile SingularAttribute<Station, String> stationName;
    public static volatile SetAttribute<Station, Trip> tripSet;
    public static volatile SingularAttribute<Station, Integer> stationId;

}