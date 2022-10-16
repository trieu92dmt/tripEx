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
@Table(name = "route")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Route.findAll", query = "SELECT r FROM Route r"),
    @NamedQuery(name = "Route.findByRouteId", query = "SELECT r FROM Route r WHERE r.routeId = :routeId"),
    @NamedQuery(name = "Route.findByDetermine", query = "SELECT r FROM Route r WHERE r.determine = :determine"),
    @NamedQuery(name = "Route.findByDescription", query = "SELECT r FROM Route r WHERE r.description = :description")})
public class Route implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "route_id")
    private Integer routeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Determine")
    private int determine;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @JoinColumn(name = "Departure", referencedColumnName = "province_id")
    @ManyToOne(optional = false)
    private Province departure;
    @JoinColumn(name = "Destination", referencedColumnName = "province_id")
    @ManyToOne(optional = false)
    private Province destination;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "route")
    private Set<Trip> tripSet;

    public Route() {
    }

    public Route(Integer routeId) {
        this.routeId = routeId;
    }

    public Route(Integer routeId, int determine) {
        this.routeId = routeId;
        this.determine = determine;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public int getDetermine() {
        return determine;
    }

    public void setDetermine(int determine) {
        this.determine = determine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Province getDeparture() {
        return departure;
    }

    public void setDeparture(Province departure) {
        this.departure = departure;
    }

    public Province getDestination() {
        return destination;
    }

    public void setDestination(Province destination) {
        this.destination = destination;
    }

    @XmlTransient
    public Set<Trip> getTripSet() {
        return tripSet;
    }

    public void setTripSet(Set<Trip> tripSet) {
        this.tripSet = tripSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (routeId != null ? routeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Route)) {
            return false;
        }
        Route other = (Route) object;
        if ((this.routeId == null && other.routeId != null) || (this.routeId != null && !this.routeId.equals(other.routeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.Route[ routeId=" + routeId + " ]";
    }
    
}
