package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Province;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Station.class)
public class Station_ { 

    public static volatile SingularAttribute<Station, Province> proviceId;
    public static volatile SingularAttribute<Station, String> address;
    public static volatile SingularAttribute<Station, String> stationName;
    public static volatile SingularAttribute<Station, Integer> stationId;

}