package com.thinksworks.Ticket.runner;

import com.thinksworks.Ticket.external.Movie;
import com.thinksworks.Ticket.external.Theatre;
import com.thinksworks.Ticket.internal.Actors;
import com.thinksworks.Ticket.internal.Shooting;

public class MainRunner {
    public static void main(String[]args){
        Movie movie = new Movie();
        movie.movieDisplay();
        Theatre theatre = new Theatre();
        theatre.theatreDisplay();
        Shooting shooting = new Shooting();
        shooting.shootingDisplay();
        Actors actors = new Actors();
        actors.actorDisplay();
    }
}
