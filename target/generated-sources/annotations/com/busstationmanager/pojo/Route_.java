package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Station;
import com.busstationmanager.pojo.Trip;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Route.class)
public class Route_ { 

    public static volatile SingularAttribute<Route, Integer> routeId;
    public static volatile SingularAttribute<Route, Integer> determine;
    public static volatile SingularAttribute<Route, Station> destination;
    public static volatile SingularAttribute<Route, String> description;
    public static volatile SingularAttribute<Route, Company> company;
    public static volatile SetAttribute<Route, Trip> tripSet;
    public static volatile SingularAttribute<Route, Station> departure;

}