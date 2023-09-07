package com.yourpackage;

public class Appointment {
    private String id;
    private String date;
    private String time;
    private String consultant;

    // Constructors, getters, and setters

    public Appointment(String id, String date, String time, String consultant) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.consultant = consultant;
    }

    // Getters and setters for each property
    // You can generate these automatically in most IDEs

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }
}
