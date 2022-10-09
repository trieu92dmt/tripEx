/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "car_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CarType.findAll", query = "SELECT c FROM CarType c"),
    @NamedQuery(name = "CarType.findByTypeId", query = "SELECT c FROM CarType c WHERE c.typeId = :typeId"),
    @NamedQuery(name = "CarType.findByTypeName", query = "SELECT c FROM CarType c WHERE c.typeName = :typeName"),
    @NamedQuery(name = "CarType.findBySeatTotal", query = "SELECT c FROM CarType c WHERE c.seatTotal = :seatTotal")})
public class CarType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "type_id")
    private Integer typeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "type_name")
    private String typeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seat_total")
    private int seatTotal;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carTypeId")
    private Set<Seat> seatSet;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeId")
    private Set<Car> carSet;

    public CarType() {
    }

    public CarType(Integer typeId) {
        this.typeId = typeId;
    }

    public CarType(Integer typeId, String typeName, int seatTotal) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.seatTotal = seatTotal;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getSeatTotal() {
        return seatTotal;
    }

    public void setSeatTotal(int seatTotal) {
        this.seatTotal = seatTotal;
    }

    @XmlTransient
    public Set<Seat> getSeatSet() {
        return seatSet;
    }

    public void setSeatSet(Set<Seat> seatSet) {
        this.seatSet = seatSet;
    }

    @XmlTransient
    public Set<Car> getCarSet() {
        return carSet;
    }

    public void setCarSet(Set<Car> carSet) {
        this.carSet = carSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeId != null ? typeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarType)) {
            return false;
        }
        CarType other = (CarType) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.CarType[ typeId=" + typeId + " ]";
    }
    
}
