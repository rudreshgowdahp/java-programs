package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Ticket;

public class TrainTicket extends Ticket {
    public TrainTicket(int ticket, int price, String ticketDate, int size) {
        super(ticket, price, ticketDate, size);
    }
}
