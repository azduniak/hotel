package com.hotelsystem.hotelsystem;

import javax.persistence.*;
import java.util.*;

@Entity

public class Reservation {


    @Id
    @GeneratedValue
    int reservationID;

    @ManyToOne
    Customer Customer;

    @Column(name="date_start")
    Date dateStart;

    @Column(name="date_end")
    Date dateEnd;

    @Column(name="days")
    int days;

    @ManyToMany
    @JoinColumn(name="room_id")
    List<Room> room;

    @Column(name="price_per_day")
    int pricePerDay;



}
