package com.seanevans.customfeed.models;

import java.util.Set;

public class User {

    private String username;
    private String email;
    private Set<selectedIssues> userSelections;

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

    public Set<selectedIssues> getUserSelections() {
        return userSelections;
    }

    public void setUserSelections(Set<selectedIssues> userSelections) {
        this.userSelections = userSelections;
    }

    enum selectedIssues{
        Technology,
        Finance,
        Sports,
        Current_affairs,
        Politics,
        Entertainment,
        Pop_culture
    }

}
