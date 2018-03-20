package com.greenwin.placedumarche.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AppUser {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String firstName;
    private String email;
    private String phoneNumber;

    @OneToOne
    private Address address;

    public AppUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private AppUser(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
