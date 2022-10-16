package com.busstationmanager.pojo;

import com.busstationmanager.pojo.Ticket;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-10-15T16:46:13")
@StaticMetamodel(BookInfo.class)
public class BookInfo_ { 

    public static volatile SingularAttribute<BookInfo, Date> bookDate;
    public static volatile SingularAttribute<BookInfo, String> phoneNumber;
    public static volatile SetAttribute<BookInfo, Ticket> ticketSet;
    public static volatile SingularAttribute<BookInfo, String> customerName;
    public static volatile SingularAttribute<BookInfo, String> email;
    public static volatile SingularAttribute<BookInfo, Integer> bookId;

}