package com.crud.enty;

public class Resume {

    String name;
    String address;

    String dob;

    String phone;

    String education;


    public Resume() {
    }

    public Resume(String name, String address, String dob, String education) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
