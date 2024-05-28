package com.example.searchapp;
import java.util.ArrayList;
import java.util.List;

public class Qualification {

    private String title;
    private String institution;
    private int year;

// constructors

    public Qualification(String title, String institution, int year) {
        this.title = title;
        this.institution = institution;
        this.year = year;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getInstitution(){
        return institution;
    }
    public int getYear(){
        return year;
    }
}