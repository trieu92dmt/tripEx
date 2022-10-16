/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.formatter;

import com.busstationmanager.pojo.Car;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class CarFormatter implements Formatter<Car>{

    @Override
    public String print(Car t, Locale locale) {
        return String.valueOf(t.getCarId());
    }

    @Override
    public Car parse(String carId, Locale locale) throws ParseException {
        Car car = new Car();
        car.setCarId(Integer.parseInt(carId));
        return car;
    }
    
}
