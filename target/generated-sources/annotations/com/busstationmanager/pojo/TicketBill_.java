package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Ticket;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(TicketBill.class)
public class TicketBill_ { 

    public static volatile SingularAttribute<TicketBill, String> total;
    public static volatile SingularAttribute<TicketBill, String> phoneNumber;
    public static volatile SingularAttribute<TicketBill, Date> createdDate;
    public static volatile SetAttribute<TicketBill, Ticket> ticketSet;
    public static volatile SingularAttribute<TicketBill, Integer> billId;
    public static volatile SingularAttribute<TicketBill, String> customerName;
    public static volatile SingularAttribute<TicketBill, String> email;

}