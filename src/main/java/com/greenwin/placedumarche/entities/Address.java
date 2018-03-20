package com.greenwin.placedumarche.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String city;
    private String zipCode;
    private String Street;
    private String number;
    private String building;
    private String sup;

    @OneToOne
    private AppUser appuser;

    @OneToOne
    private Supplier supplier;

    public Address(String city, String zipCode, String street, String number) {
        this.city = city;
        this.zipCode = zipCode;
        Street = street;
        this.number = number;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
