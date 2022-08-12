package io.myfenix.banana.controller;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private Integer id;
    private String name;

    public Doctor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Doctor.Appointment> available = new ArrayList<>();

    public ArrayList<Appointment> getAvailable() {
        return available;
    }

    public void setAvailable(Date date, String time) {
        this.available.add(new Doctor.Appointment(date, time));
    }

    public static class Appointment{
        private Date date;
        private String time;

        public Appointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }
}
