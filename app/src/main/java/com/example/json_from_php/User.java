package com.example.json_from_php;

/**
 * Created by Mitch on 2016-05-13.
 */
public class User {
    private String FirstName;
    private String LastName;
    private String FavFood;
    private String Date;

    public User(String fName, String lName, String fFood, String dDate){
        FirstName = fName;
        LastName = lName;
        FavFood = fFood;
        Date = dDate;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFavFood() {
        return FavFood;
    }

    public void setFavFood(String favFood) {
        FavFood = favFood;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

}
