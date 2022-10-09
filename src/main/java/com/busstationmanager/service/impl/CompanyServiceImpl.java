/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.service.impl;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.CarType;
import com.busstationmanager.pojo.User;
import com.busstationmanager.repository.CompanyRepository;
import com.busstationmanager.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;
    
    @Override
    public boolean UpdateCompany(User user) {
        return this.companyRepository.UpdateCompany(user);
    }

    @Override
    public List<Car> getCarByCompanyId(int companyId) {
        return this.companyRepository.getCarByCompanyId(companyId);
    }

    @Override
    public List<CarType> getCarTypes() {
        return this.companyRepository.getCarTypes();
    }

    @Override
    public boolean addCar(Car car) {
        return this.companyRepository.addCar(car);
    }

    @Override
    public boolean updateCar(Car car) {
        return this.companyRepository.updateCar(car);
    }

    @Override
    public Car getCar(int id) {
        return this.companyRepository.getCar(id);
    }

    @Override
    public boolean deleteCar(int carId) {
        Car car = this.companyRepository.getCar(carId);
        return this.companyRepository.deleteCar(car);
    }
    
}
