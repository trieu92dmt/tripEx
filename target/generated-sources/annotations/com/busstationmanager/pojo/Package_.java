package com.busstationmanager.pojo;

import com.busstationmanager.pojo.PackageBill;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-09-24T15:26:06")
@StaticMetamodel(Package.class)
public class Package_ { 

    public static volatile SetAttribute<Package, PackageBill> packageBillSet;
    public static volatile SingularAttribute<Package, BigInteger> price;
    public static volatile SingularAttribute<Package, Date> expiredDate;
    public static volatile SingularAttribute<Package, Integer> packageId;
    public static volatile SingularAttribute<Package, String> packageName;
    public static volatile SingularAttribute<Package, Integer> carLimit;

}