package com.hotelsystem.Room;

import com.hotelsystem.Reservation.ReservationEntity;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

public class RoomEntity {

    @Column(name="price")
    int price;

    @Column(name="city")
    String city;

    @ManyToMany(mappedBy="rooms")
    List<ReservationEntity> reservationList;

    @Column(name="room_id")
    int room_id;

}
