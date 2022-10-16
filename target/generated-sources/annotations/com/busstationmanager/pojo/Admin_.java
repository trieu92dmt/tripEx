package com.busstationmanager.pojo;

import com.busstationmanager.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, String> address;
    public static volatile SingularAttribute<Admin, String> identity;
    public static volatile SingularAttribute<Admin, String> fullName;
    public static volatile SingularAttribute<Admin, Integer> userId;
    public static volatile SingularAttribute<Admin, User> user;

}