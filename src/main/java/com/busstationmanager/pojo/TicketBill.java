/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
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
@Table(name = "ticket_bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TicketBill.findAll", query = "SELECT t FROM TicketBill t"),
    @NamedQuery(name = "TicketBill.findByBillId", query = "SELECT t FROM TicketBill t WHERE t.billId = :billId"),
    @NamedQuery(name = "TicketBill.findByCustomerName", query = "SELECT t FROM TicketBill t WHERE t.customerName = :customerName"),
    @NamedQuery(name = "TicketBill.findByPhoneNumber", query = "SELECT t FROM TicketBill t WHERE t.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "TicketBill.findByEmail", query = "SELECT t FROM TicketBill t WHERE t.email = :email"),
    @NamedQuery(name = "TicketBill.findByTotal", query = "SELECT t FROM TicketBill t WHERE t.total = :total"),
    @NamedQuery(name = "TicketBill.findByCreatedDate", query = "SELECT t FROM TicketBill t WHERE t.createdDate = :createdDate")})
public class TicketBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bill_id")
    private Integer billId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "customer_name")
    private String customerName;
    @Size(max = 45)
    @Column(name = "phone_number")
    private String phoneNumber;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "total")
    private String total;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(mappedBy = "billId")
    private Set<Ticket> ticketSet;

    public TicketBill() {
    }

    public TicketBill(Integer billId) {
        this.billId = billId;
    }

    public TicketBill(Integer billId, String customerName, String total) {
        this.billId = billId;
        this.customerName = customerName;
        this.total = total;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @XmlTransient
    public Set<Ticket> getTicketSet() {
        return ticketSet;
    }

    public void setTicketSet(Set<Ticket> ticketSet) {
        this.ticketSet = ticketSet;
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
        if (!(object instanceof TicketBill)) {
            return false;
        }
        TicketBill other = (TicketBill) object;
        if ((this.billId == null && other.billId != null) || (this.billId != null && !this.billId.equals(other.billId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.TicketBill[ billId=" + billId + " ]";
    }
    
}
