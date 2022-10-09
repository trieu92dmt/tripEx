/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.busstationmanager.repository.impl;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Customer;
import com.busstationmanager.pojo.PackageBill;
import com.busstationmanager.pojo.Role;
import com.busstationmanager.pojo.User;
import com.busstationmanager.repository.UserRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public boolean addUser(User user) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.save(user);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public List<User> getUsers(String username) {
        Session session = sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root root = query.from(User.class);
        query = query.select(root);
        if (!username.isEmpty()) {
            Predicate p = builder.equal(root.get("username").as(String.class), username.trim());
            query.where(p);
        }

        Query q = session.createQuery(query);

        return q.getResultList();
    }

//    @Override
//    public boolean updateUser(User user) {
//        Session session = sessionFactory.getObject().getCurrentSession();
//        try {
//            session.merge(user);
//            return true;
//        } catch (HibernateException ex) {
//            System.err.println(ex.getMessage());
//        }
//        return false;
//    }
    @Override
    public User getUserById(int id){
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(User.class,id);
    }

    @Override
    public boolean addUserCustomer(User user, Customer cus) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.save(user);
            cus.setUserId(user.getUserId());
            session.save(cus);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean addUserCompany(User user, Company com, PackageBill bill) {
        Session session = sessionFactory.getObject().getCurrentSession();
        try {
            session.save(user);
            com.setUserId(user.getUserId());
            session.save(com);
            bill.setCompanyId(com);
            session.save(bill);
            return true;
        } catch (HibernateException ex) {
            System.err.println(ex.getMessage());
        }
        return false;
    }

    
}
