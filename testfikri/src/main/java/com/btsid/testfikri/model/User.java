package com.btsid.testfikri.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
@Entity
public class User {

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String country;
    private String city;
    private String postcode;
    private String name;
    private String address;

    public User(String username, String password, String email, String phone, String country, String city, String postcode, String name, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.postcode = postcode;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
