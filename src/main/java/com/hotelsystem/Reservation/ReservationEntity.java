package com.hotelsystem.Reservation;

import com.hotelsystem.Customer.CustomerEntity;
import com.hotelsystem.Room.RoomEntity;

import javax.persistence.*;
import java.util.*;

@Entity
public class ReservationEntity {


    @Id
    @GeneratedValue
    @Column(name="reservation_id")
    int reservationID;

    @ManyToOne
    CustomerEntity Customer;

    @Column(name="date_start")
    Date dateStart;

    @Column(name="date_end")
    Date dateEnd;

    @Column(name="days")
    int days;

    @ManyToMany
    @JoinTable(name ="reservation_room", joinColumns = @JoinColumn(name = "reservation_id", referencedColumnName = "reservationID"), inverseJoinColumns=@JoinColumn(name="room_id", referencedColumnName = "room_id"))
    List<RoomEntity> rooms;

    @Column(name="price_per_day")
    int pricePerDay;

}
