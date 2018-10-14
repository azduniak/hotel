package com.hotelsystem.hotelsystem;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

public class Customer {

    @Id
    @Column(name="customer_id")
    int customerID;

    @Column(name="name")
    String name;

    @Column(name="surname")
    String surname;

    @OneToMany
    @JoinColumn(name="reservation_id")
    Reservation reservation;

}
