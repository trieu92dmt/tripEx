package com.busstationmanager.formatter;

import com.busstationmanager.pojo.CarType;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

public class CarTypeFormatter  implements Formatter<CarType>{

    @Override
    public String print(CarType t, Locale locale) {
        return String.valueOf(t.getTypeId());
    }

    @Override
    public CarType parse(String carTypeId, Locale locale) throws ParseException {
        CarType carType = new CarType();
        carType.setTypeId(Integer.parseInt(carTypeId));
        return carType;
    }
    
}