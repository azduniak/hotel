package com.hotelsystem.hotelsystem;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

public class Room {

    @Column(name="price")
    int Price;

    @Column(name="city")
    String City;

    @ManyToMany(mappedBy="room_id")
    List<Reservation> reservationList;

    /*jak zmapowac liste w SQL?*/



    @Column(name="room  _id")
    int room_id;

}
