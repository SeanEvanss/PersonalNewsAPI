package com.seanevans.customfeed.service;


/*
* This interface is for us to define the expected functionality for our user class
* */

import com.seanevans.customfeed.models.User;

public interface UserService {

    User findByEmail(String email);
    void createUser(String email, String hashed_password);

}
