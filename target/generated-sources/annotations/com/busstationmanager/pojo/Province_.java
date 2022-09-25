package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Province.class)
public class Province_ { 

    public static volatile SingularAttribute<Province, String> provinceName;
    public static volatile SingularAttribute<Province, Integer> provinceId;
    public static volatile SetAttribute<Province, Station> stationSet;

}