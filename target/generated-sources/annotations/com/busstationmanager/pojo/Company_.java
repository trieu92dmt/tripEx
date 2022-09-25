package com.busstationmanager.pojo;

import com.busstationmanager.pojo.PackageBill;
import com.busstationmanager.pojo.Route;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, String> address;
    public static volatile SetAttribute<Company, PackageBill> packageBillSet;
    public static volatile SingularAttribute<Company, String> companyName;
    public static volatile SingularAttribute<Company, Date> expiredDate;
    public static volatile SetAttribute<Company, Route> routeSet;
    public static volatile SingularAttribute<Company, Integer> userId;
    public static volatile SingularAttribute<Company, Integer> carLimit;

}