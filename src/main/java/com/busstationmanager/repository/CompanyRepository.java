/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.busstationmanager.repository;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.CarType;
import com.busstationmanager.pojo.User;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface CompanyRepository {
//    boolean UpdateCompany(Company com);
    boolean UpdateCompany(User user);
    List<Car> getCarByCompanyId(int companyId);
    List<CarType> getCarTypes();
    boolean addCar(Car car);
    boolean updateCar(Car car);
    Car getCar(int id);
    boolean deleteCar(Car car);
}
