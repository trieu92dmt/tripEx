/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.pojo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "package")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p"),
    @NamedQuery(name = "Package.findByPackageId", query = "SELECT p FROM Package p WHERE p.packageId = :packageId"),
    @NamedQuery(name = "Package.findByPackageName", query = "SELECT p FROM Package p WHERE p.packageName = :packageName"),
    @NamedQuery(name = "Package.findByExpiredDate", query = "SELECT p FROM Package p WHERE p.expiredDate = :expiredDate"),
    @NamedQuery(name = "Package.findByCarLimit", query = "SELECT p FROM Package p WHERE p.carLimit = :carLimit"),
    @NamedQuery(name = "Package.findByPrice", query = "SELECT p FROM Package p WHERE p.price = :price")})
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "package_id")
    private Integer packageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "package_name")
    private String packageName;
    @Column(name = "expired_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiredDate;
    @Column(name = "car_limit")
    private Integer carLimit;
    @Column(name = "price")
    private BigInteger price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packageId")
    private Set<PackageBill> packageBillSet;

    public Package() {
    }

    public Package(Integer packageId) {
        this.packageId = packageId;
    }

    public Package(Integer packageId, String packageName) {
        this.packageId = packageId;
        this.packageName = packageName;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Integer getCarLimit() {
        return carLimit;
    }

    public void setCarLimit(Integer carLimit) {
        this.carLimit = carLimit;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    @XmlTransient
    public Set<PackageBill> getPackageBillSet() {
        return packageBillSet;
    }

    public void setPackageBillSet(Set<PackageBill> packageBillSet) {
        this.packageBillSet = packageBillSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (packageId != null ? packageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.packageId == null && other.packageId != null) || (this.packageId != null && !this.packageId.equals(other.packageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.Package[ packageId=" + packageId + " ]";
    }
    
}
