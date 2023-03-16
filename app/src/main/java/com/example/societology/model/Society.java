package com.example.societology.model;

public class Society {

    private String societyShortName;
    private String societyFullName;
    private String headName;
    private String startDate;
    private int Active;

    public int getActive() {
        return Active;
    }

    private int societyid;

    public Society(String societyShortName, String societyFullName, String headName, String startDate) {
        this.societyShortName = societyShortName;
        this.societyFullName = societyFullName;
        this.headName = headName;
        this.startDate = startDate;
    }

    public Society(String societyShortName, String societyFullName, String headName, String startDate, int active) {
        this.societyShortName = societyShortName;
        this.societyFullName = societyFullName;
        this.headName = headName;
        this.startDate = startDate;
        Active = active;
    }

    public String getSocietyShortName() {
        return societyShortName;
    }

    public String getSocietyFullName() {
        return societyFullName;
    }

    public String getHeadName() {
        return headName;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getSocietyid() {
        return societyid;
    }
}
