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
import javax.persistence.JoinColumns;
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
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t"),
    @NamedQuery(name = "Ticket.findByTicketId", query = "SELECT t FROM Ticket t WHERE t.ticketId = :ticketId"),
    @NamedQuery(name = "Ticket.findBySeatNumber", query = "SELECT t FROM Ticket t WHERE t.seatNumber = :seatNumber"),
    @NamedQuery(name = "Ticket.findByPrice", query = "SELECT t FROM Ticket t WHERE t.price = :price"),
    @NamedQuery(name = "Ticket.findByBuyDate", query = "SELECT t FROM Ticket t WHERE t.buyDate = :buyDate")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ticket_id")
    private Integer ticketId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "seat_number")
    private String seatNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private BigInteger price;
    @Column(name = "buy_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date buyDate;
    @JoinColumns(@JoinColumn(name = "book_id", referencedColumnName = "book_id"))
    @ManyToOne
    private BookInfo bookInfo;
    @JoinColumn(name = "bill_id", referencedColumnName = "bill_id")
    @ManyToOne
    private TicketBill billId;
    @JoinColumns(@JoinColumn(name = "trip_id", referencedColumnName = "trip_id"))
    @ManyToOne(optional = false)
    private Trip trip;

    public Ticket() {
    }

    public Ticket(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket(Integer ticketId, String seatNumber, BigInteger price) {
        this.ticketId = ticketId;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    public TicketBill getBillId() {
        return billId;
    }

    public void setBillId(TicketBill billId) {
        this.billId = billId;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketId != null ? ticketId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.ticketId == null && other.ticketId != null) || (this.ticketId != null && !this.ticketId.equals(other.ticketId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.busstationmanager.pojo.Ticket[ ticketId=" + ticketId + " ]";
    }
    
}
