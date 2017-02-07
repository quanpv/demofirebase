package com.quanpv.demofirebase;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by omi on 7/2/2017.
 */

@IgnoreExtraProperties
public class User {

    public String name;
    public String email;
    public String address;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}