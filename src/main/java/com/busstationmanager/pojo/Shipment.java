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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "shipment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipment.findAll", query = "SELECT s FROM Shipment s"),
    @NamedQuery(name = "Shipment.findByShipId", query = "SELECT s FROM Shipment s WHERE s.shipId = :shipId"),
    @NamedQuery(name = "Shipment.findBySender", query = "SELECT s FROM Shipment s WHERE s.sender = :sender"),
    @NamedQuery(name = "Shipment.findByReceiver", query = "SELECT s FROM Shipment s WHERE s.receiver = :receiver"),
    @NamedQuery(name = "Shipment.findByPhoneNumber", query = "SELECT s FROM Shipment s WHERE s.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Shipment.findByEmail", query = "SELECT s FROM Shipment s WHERE s.email = :email"),
    @NamedQuery(name = "Shipment.findByDeliveryTime", query = "SELECT s FROM Shipment s WHERE s.deliveryTime = :deliveryTime"),
    @NamedQuery(name = "Shipment.findByCost", query = "SELECT s FROM Shipment s WHERE s.cost = :cost"),
    @NamedQuery(name = "Shipment.findByStatus", query = "SELECT s FROM Shipment s WHERE s.status = :status")})
public class Shipment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ship_id")
    private Integer shipId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "sender")
    private String sender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "receiver")
    private String receiver;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phone_number")
    private String phoneNumber;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Column(name = "delivery_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cost")
    private BigInteger cost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @JoinColumn(name = "trip_id", referencedColumnName = "trip_id")
    @ManyToOne(optional = false)
    private Trip tripId;

    public Shipment() {
    }

    public Shipment(Integer shipId) {
        this.shipId = shipId;
    }

    public Shipment(Integer shipId, String sender, String receiver, String phoneNumber, String email, BigInteger cost, int status) {
        this.shipId = shipId;
        this.sender = sender;
        this.receiver = receiver;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cost = cost;
        this.status = status;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigInteger getCost() {
        return cost;
    }

    public void setCost(BigInteger cost) {
        this.cost = cost;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Trip getTripId() {
        return tripId;
    }

    public void setTripId(Trip tripId) {
        this.tripId = tripId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipId != null ? shipId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipment)) {
            return false;
        }
        Shipment other = (Shipment) object;
        if ((this.shipId == null && other.shipId != null) || (this.shipId != null && !this.shipId.equals(other.shipId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.Shipment[ shipId=" + shipId + " ]";
    }
    
}
