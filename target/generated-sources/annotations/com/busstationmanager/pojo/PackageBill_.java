package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Package;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-09T18:49:54")
@StaticMetamodel(PackageBill.class)
public class PackageBill_ { 

    public static volatile SingularAttribute<PackageBill, BigInteger> total;
    public static volatile SingularAttribute<PackageBill, Company> companyId;
    public static volatile SingularAttribute<PackageBill, Date> createdDate;
    public static volatile SingularAttribute<PackageBill, BigInteger> price;
    public static volatile SingularAttribute<PackageBill, Integer> billId;
    public static volatile SingularAttribute<PackageBill, Package> packageId;
    public static volatile SingularAttribute<PackageBill, Double> discount;

}