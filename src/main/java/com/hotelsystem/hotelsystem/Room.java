package com.hotelsystem.hotelsystem;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

public class Room {

    @Column(name="price")
    int Price;

    @Column(name="city")
    String City;

    @ManyToMany(mappedBy="rooms")
    List<Reservation> reservationList;





    @Column(name="room_id")
    int room_id;

}
