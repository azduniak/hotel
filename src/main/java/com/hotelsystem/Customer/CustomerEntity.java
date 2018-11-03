package com.hotelsystem.Customer;

import com.hotelsystem.Reservation.ReservationEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CustomerEntity {

    @Id
    @Column(name="customer_id")
    int customerID;

    @Column(name="name")
    String name;

    @Column(name="surname")
    String surname;

    @OneToMany
    @JoinColumn(name="reservation_id")
    ReservationEntity reservation;

}
