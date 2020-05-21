package com.example.demo;
/*Java Bean file that will define a customer*/
public class Customer {
    private String name;
    private String phoneNum;
    private String petInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPetInfo() {
        return petInfo;
    }

    public void setPetInfo(String petInfo) {
        this.petInfo = petInfo;
    }
}
