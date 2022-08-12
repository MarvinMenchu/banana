package io.myfenix.banana.entity;

public class Doctor extends User{

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
