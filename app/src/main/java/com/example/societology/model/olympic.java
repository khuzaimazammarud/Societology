package com.example.societology.model;

public class olympic {

    private String _id;
    private String rank;
    private String name;
    private String dob;
    private String country;
    private int score;
    private String event;

    public olympic(String rank, String name, String dob, String country, int score, String event) {
        this.rank = rank;
        this.name = name;
        this.dob = dob;
        this.country = country;
        this.score = score;
        this.event = event;
    }

    public String getId() {
        return _id;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getCountry() {
        return country;
    }

    public int getScore() {
        return score;
    }

    public String getEvent() {
        return event;
    }
}
