/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.repository.impl;

import com.busstationmanager.pojo.Car;
import com.busstationmanager.pojo.CarType;
import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.User;
import com.busstationmanager.repository.CompanyRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
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
public class CompanyRepositoryImpl implements CompanyRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public boolean UpdateCompany(User user) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.update(user);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Car> getCarByCompanyId(int companyId) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Car> query = builder.createQuery(Car.class);
        Root root = query.from(Car.class);
        query = query.select(root);
        query.where(builder.equal(root.get("companyId"), companyId));
        Query q = session.createQuery(query);
        
        return q.getResultList();   
    }

    @Override
    public List<CarType> getCarTypes() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<CarType> query = builder.createQuery(CarType.class);
        Root root = query.from(CarType.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();   
    }

    @Override
    public boolean addCar(Car car) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.save(car);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean updateCar(Car car) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.update(car);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.getObject().getCurrentSession();
        return session.get(Car.class, id);
    }

    @Override
    public boolean deleteCar(Car car) {
        Session session = sessionFactory.getObject().getCurrentSession();
        session.delete(car);
        return true;
    }

    @Override
    public List<Company> getListCompany() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Company> query = builder.createQuery(Company.class);
        Root root = query.from(Company.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();   
    }
}
