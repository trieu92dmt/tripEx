/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.formatter;

import com.busstationmanager.pojo.Station;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class StationFormatter implements Formatter<Station>{

    @Override
    public String print(Station t, Locale locale) {
        return String.valueOf(t.getStationId());
    }

    @Override
    public Station parse(String stationId, Locale locale) throws ParseException {
        Station station = new Station();
        station.setStationId(Integer.parseInt(stationId));
        return station;
    }
}