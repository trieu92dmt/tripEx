package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Admin;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Customer;
import com.busstationmanager.pojo.Role;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, Date> createdDate;
    public static volatile SingularAttribute<User, Role> roleId;
    public static volatile SingularAttribute<User, Company> company;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SetAttribute<User, Admin> adminSet;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SingularAttribute<User, Integer> status;
    public static volatile SingularAttribute<User, Customer> customer;

}