package com.example.bettercleaning.UserData;

import java.util.Date;

public class User {
    private String FirstName;
    private String lastName;
    private Date dateOfBirth;
    private String Gender;

    public User() {

    }

    public User(String firstName, String lastName, Date dateOfBirth, String gender) {
        FirstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        Gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
