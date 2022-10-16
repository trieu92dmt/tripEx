package com.busstationmanager.pojo;

import com.busstationmanager.pojo.BookInfo;
import com.busstationmanager.pojo.TicketBill;
import com.busstationmanager.pojo.Trip;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, BookInfo> bookInfo;
    public static volatile SingularAttribute<Ticket, Trip> trip;
    public static volatile SingularAttribute<Ticket, BigInteger> price;
    public static volatile SingularAttribute<Ticket, Date> buyDate;
    public static volatile SingularAttribute<Ticket, TicketBill> billId;
    public static volatile SingularAttribute<Ticket, Integer> ticketId;
    public static volatile SingularAttribute<Ticket, String> seatNumber;

}