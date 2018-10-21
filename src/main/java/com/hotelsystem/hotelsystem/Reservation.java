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
            @JoinTable(name ="reservation_room", joinColumns = @JoinColumn(name = "reservation_id", referencedColumnName = "reservationID"), inverseJoinColumns=@JoinColumn(name="room_id", referencedColumnName = "room_id"))
    List<Room> rooms;

    @Column(name="price_per_day")
    int pricePerDay;



}
