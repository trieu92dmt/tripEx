/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.repository.impl;

import com.busstationmanager.dtos.TripSearch;
import com.busstationmanager.pojo.Province;
import com.busstationmanager.pojo.Route;
import com.busstationmanager.pojo.Station;
import com.busstationmanager.pojo.Trip;
import com.busstationmanager.repository.TripRepository;
import java.util.Date;
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
public class TripRepositoryImpl implements TripRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Province> getProvinces() {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Province> query = builder.createQuery(Province.class);
        Root root = query.from(Province.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public List<Trip> getTrips() {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Trip> query = builder.createQuery(Trip.class);
        Root root = query.from(Trip.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public boolean addTrip(Trip trip) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.save(trip);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<Station> getStations() {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Station> query = builder.createQuery(Station.class);
        Root root = query.from(Station.class);
        query = query.select(root);
        Query q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public Route getRouteByDepartureAndDestination(int dep, int des) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Route> query = builder.createQuery(Route.class);
        Root root = query.from(Route.class);
        query = query.select(root);
        query.where(builder.equal(root.get("departure"), dep));
        query.where(builder.equal(root.get("destination"), des));
        Query q = session.createQuery(query);
        
        return (Route) q.getResultList().get(0);  
    }

    @Override
    public List<Trip> searchTrips(Route route) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Trip> query = builder.createQuery(Trip.class);
        Root root = query.from(Trip.class);
        query = query.select(root);
        query.where(builder.equal(root.get("route"), route.getRouteId()));
        Query q = session.createQuery(query);
        
        return q.getResultList();
    }

    @Override
    public Trip getTripById(int id) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(Trip.class, id);
    }
    
}
