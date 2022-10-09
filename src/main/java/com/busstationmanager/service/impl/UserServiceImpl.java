/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.busstationmanager.service.impl;

import com.busstationmanager.pojo.Company;
import com.busstationmanager.pojo.Customer;
import com.busstationmanager.pojo.Package;
import com.busstationmanager.pojo.PackageBill;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.busstationmanager.pojo.User;
import com.busstationmanager.repository.PackageRepository;
import com.busstationmanager.repository.RoleRepository;
import com.busstationmanager.repository.UserRepository;
import com.busstationmanager.service.UserService;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PackageRepository packageRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private Cloudinary cloudianry;

    @Override
    public boolean addUser(User user, int roleId) {
        String pass = user.getPassword();
        user.setPassword(this.passwordEncoder.encode(pass));
        user.setRoleId(roleRepository.getRoleById(roleId));
        try {
            if (!user.getFile().isEmpty()) {
                Map r = this.cloudianry.uploader().upload(user.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                user.setAvatar((String) r.get("secure_url"));
            }
            else{
                user.setAvatar("https://res.cloudinary.com/minhtrieu-cloudinary/image/upload/v1661619527/rkren0obyueqlndsnuon.png");
            }
        } catch (IOException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.userRepository.addUser(user);
    }

    @Override
    public List<User> getUsers(String username) {
        return this.userRepository.getUsers(username);
    }
    @Override
    public User getUserById(int id) {
        return  this.userRepository.getUserById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = this.getUsers(username);
        if (users.isEmpty()) {
            throw new UsernameNotFoundException("Tài khoản không tồn tại");
        }

        User user = users.get(0);
        Set<GrantedAuthority> auth = new HashSet<>();
        auth.add(new SimpleGrantedAuthority(user.getRoleId().getRoleName()));

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), auth);
    }

//    @Override
//    public boolean updateUser(User user) {
//        return this.userRepository.updateUser(user);
//    }

    @Override
    public boolean addUserCustomer(User user, Customer cus) {
        user.setRoleId(roleRepository.getRoleById(3));
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        user.setCreatedDate(new Date());
        try {
            if (!user.getFile().isEmpty()) {
                Map r = this.cloudianry.uploader().upload(user.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                user.setAvatar((String) r.get("secure_url"));
            }
            else{
                user.setAvatar("https://res.cloudinary.com/minhtrieu-cloudinary/image/upload/v1661619527/rkren0obyueqlndsnuon.png");
            }
        } catch (IOException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.userRepository.addUserCustomer(user, cus);
    }

    @Override
    public boolean addUserCompany(User user, Company com, int packageId) {
        user.setRoleId(roleRepository.getRoleById(2));
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        user.setCreatedDate(new Date());
        try {
            if (!user.getFile().isEmpty()) {
                Map r = this.cloudianry.uploader().upload(user.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                user.setAvatar((String) r.get("secure_url"));
            }
            else{
                user.setAvatar("https://res.cloudinary.com/minhtrieu-cloudinary/image/upload/v1661619527/rkren0obyueqlndsnuon.png");
            }
        } catch (IOException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //
        Package pk = packageRepository.getById(packageId);
        
        //
        com.setCarLimit(pk.getCarLimit());
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE, pk.getExpiredDate());
        com.setExpiredDate(cal.getTime());
        
        PackageBill bill = new PackageBill();
        bill.setCreatedDate(new Date());
        bill.setPackageId(pk);
        bill.setPrice(pk.getPrice());
        bill.setTotal(pk.getPrice());
        
        return this.userRepository.addUserCompany(user, com, bill);
    }
}
