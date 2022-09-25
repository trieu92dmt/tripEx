/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.pojo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "package_bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PackageBill.findAll", query = "SELECT p FROM PackageBill p"),
    @NamedQuery(name = "PackageBill.findByBillId", query = "SELECT p FROM PackageBill p WHERE p.billId = :billId"),
    @NamedQuery(name = "PackageBill.findByCreatedDate", query = "SELECT p FROM PackageBill p WHERE p.createdDate = :createdDate"),
    @NamedQuery(name = "PackageBill.findByPrice", query = "SELECT p FROM PackageBill p WHERE p.price = :price"),
    @NamedQuery(name = "PackageBill.findByDiscount", query = "SELECT p FROM PackageBill p WHERE p.discount = :discount"),
    @NamedQuery(name = "PackageBill.findByTotal", query = "SELECT p FROM PackageBill p WHERE p.total = :total")})
public class PackageBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bill_id")
    private Integer billId;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigInteger price;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "discount")
    private Double discount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private BigInteger total;
    @JoinColumn(name = "company_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Company companyId;
    @JoinColumn(name = "package_id", referencedColumnName = "package_id")
    @ManyToOne(optional = false)
    private Package packageId;

    public PackageBill() {
    }

    public PackageBill(Integer billId) {
        this.billId = billId;
    }

    public PackageBill(Integer billId, BigInteger price, BigInteger total) {
        this.billId = billId;
        this.price = price;
        this.total = total;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public Package getPackageId() {
        return packageId;
    }

    public void setPackageId(Package packageId) {
        this.packageId = packageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billId != null ? billId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PackageBill)) {
            return false;
        }
        PackageBill other = (PackageBill) object;
        if ((this.billId == null && other.billId != null) || (this.billId != null && !this.billId.equals(other.billId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.PackageBill[ billId=" + billId + " ]";
    }
    
}
