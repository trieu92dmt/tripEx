/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.busstationmanager.service;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Customer;
import com.busstationmanager.pojo.Package;
import com.busstationmanager.pojo.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author ASUS
 */
public interface UserService extends UserDetailsService{
    boolean addUser(User user, int roleId);
    boolean addUserCustomer(User user, Customer cus);
    boolean addUserCompany(User user, Company com, int packageId);
//    boolean updateUser(User user);
    List<User> getUsers(String username);
    User getUserById (int id);
}
