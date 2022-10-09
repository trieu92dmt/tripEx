/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.busstationmanager.repository;

import java.util.List;
import com.busstationmanager.pojo.Package;

/**
 *
 * @author Admin
 */
public interface PackageRepository {
    List<Package> getPackages();
    Package getById(int id);
}
