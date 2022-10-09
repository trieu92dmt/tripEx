/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.repository.impl;

import com.busstationmanager.repository.PackageRepository;
import com.busstationmanager.pojo.Package;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class PackageRepositoryImpl implements PackageRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Package> getPackages() {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Package> query = builder.createQuery(Package.class);
        Root root = query.from(Package.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public Package getById(int id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Package.class, id);
    }
    
}
