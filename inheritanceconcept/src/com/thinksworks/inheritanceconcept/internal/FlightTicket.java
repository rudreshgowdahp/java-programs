package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Ticket;

public class FlightTicket extends Ticket {
    public FlightTicket( int price, String ticketDate, int size) {
        super(ticket, price, ticketDate, size);
    }
}
