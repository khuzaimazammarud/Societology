package com.example.societology.model;

public class Event {

    private String societyname;
    private String eventname;
    private String startdate;
    private String Describtion;
    private String venue;
    private int societyid;
    private String eventId;

    public String getEventId() {
        return eventId;
    }

    public Event(String societyname, String eventname, String startdate, int societyid, String eventId) {
        this.societyname = societyname;
        this.eventname = eventname;
        this.startdate = startdate;
        this.societyid = societyid;
        this.eventId = eventId;
    }

    public int getSocietyid() {
        return societyid;
    }

    public Event(String societyname, String eventname, String startdate, int societyid) {
        this.societyname = societyname;
        this.eventname = eventname;
        this.startdate = startdate;
        this.societyid = societyid;
    }

    public Event(String societyname, String eventname, String startdate) {
        this.societyname = societyname;
        this.eventname = eventname;
        this.startdate = startdate;
    }

    public Event(String eventname, String startdate, String describtion, String venue) {
        this.eventname = eventname;
        this.startdate = startdate;
        Describtion = describtion;
        this.venue = venue;
    }

    public String getDescribtion() {
        return Describtion;
    }

    public String getVenue() {
        return venue;
    }

    public String getSocietyname() {
        return societyname;
    }

    public String getEventname() {
        return eventname;
    }

    public String getStartdate() {
        return startdate;
    }

}

