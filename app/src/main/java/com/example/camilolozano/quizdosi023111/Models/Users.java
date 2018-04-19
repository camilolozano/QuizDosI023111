package com.example.camilolozano.quizdosi023111.Models;

/**
 * Created by camilolozano on 17/04/18.
 */

public class Users {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String username;
    private String email;
    private String street;



    @Override
    public String toString() {
        return "Name: " +  name + "\n" + "username: " + username + "\n" + "email: " +  email + "\n" + "street: " + street ;
    }
}
