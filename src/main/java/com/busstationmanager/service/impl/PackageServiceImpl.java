/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.service.impl;

import com.busstationmanager.pojo.Package;
import com.busstationmanager.repository.PackageRepository;
import com.busstationmanager.service.PackageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PackageServiceImpl implements PackageService{
    @Autowired
    private PackageRepository packageRepository;

    @Override
    public List<Package> getPackages() {
        return this.packageRepository.getPackages();
    }
    
}
