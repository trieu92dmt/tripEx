/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.busstationmanager.repository;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Customer;
import com.busstationmanager.pojo.PackageBill;
import com.busstationmanager.pojo.User;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface UserRepository {
    boolean addUser(User user);
    boolean addUserCustomer(User user, Customer cus);
    boolean addUserCompany(User user, Company com, PackageBill bill);
//    boolean updateUser(User user);
    List<User> getUsers(String username);
    User getUserById(int id);
}
