package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(Province.class)
public class Province_ { 

    public static volatile SetAttribute<Province, Route> routeSet1;
    public static volatile SetAttribute<Province, Route> routeSet;
    public static volatile SingularAttribute<Province, String> provinceName;
    public static volatile SingularAttribute<Province, Integer> provinceId;
    public static volatile SetAttribute<Province, Station> stationSet;

}