/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busstationmanager.pojo;

import java.io.Serializable;
import java.util.Set;
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
@Table(name = "station")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Station.findAll", query = "SELECT s FROM Station s"),
    @NamedQuery(name = "Station.findByStationId", query = "SELECT s FROM Station s WHERE s.stationId = :stationId"),
    @NamedQuery(name = "Station.findByStationName", query = "SELECT s FROM Station s WHERE s.stationName = :stationName"),
    @NamedQuery(name = "Station.findByAddress", query = "SELECT s FROM Station s WHERE s.address = :address")})
public class Station implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "station_id")
    private Integer stationId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "station_name")
    private String stationName;
    @Size(max = 255)
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "fromStation")
    private Set<Trip> tripSet;
    @OneToMany(mappedBy = "toStation")
    private Set<Trip> tripSet1;
    @JoinColumn(name = "provice_id", referencedColumnName = "province_id")
    @ManyToOne(optional = false)
    private Province proviceId;

    public Station() {
    }

    public Station(Integer stationId) {
        this.stationId = stationId;
    }

    public Station(Integer stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlTransient
    public Set<Trip> getTripSet() {
        return tripSet;
    }

    public void setTripSet(Set<Trip> tripSet) {
        this.tripSet = tripSet;
    }

    @XmlTransient
    public Set<Trip> getTripSet1() {
        return tripSet1;
    }

    public void setTripSet1(Set<Trip> tripSet1) {
        this.tripSet1 = tripSet1;
    }

    public Province getProviceId() {
        return proviceId;
    }

    public void setProviceId(Province proviceId) {
        this.proviceId = proviceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationId != null ? stationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Station)) {
            return false;
        }
        Station other = (Station) object;
        if ((this.stationId == null && other.stationId != null) || (this.stationId != null && !this.stationId.equals(other.stationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.Station[ stationId=" + stationId + " ]";
    }
    
}
