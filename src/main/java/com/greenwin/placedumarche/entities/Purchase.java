package com.greenwin.placedumarche.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Purchase {

    @Id
    @GeneratedValue
    private int id;
    private float total;

    @ManyToOne
    private Customer customer;

    public Purchase(float total, Customer customer) {
        this.total = total;
        this.customer = customer;
    }

    private Purchase() {

    }

    public int getId() {
        return id;
    }

    public float getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }
}
