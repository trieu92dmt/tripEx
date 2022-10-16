package com.busstationmanager.pojo;

import com.busstationmanager.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SingularAttribute<Role, Integer> roleId;
    public static volatile SingularAttribute<Role, String> roleName;
    public static volatile SetAttribute<Role, User> userSet;

}