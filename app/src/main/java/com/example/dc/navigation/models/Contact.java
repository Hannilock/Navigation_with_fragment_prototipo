package com.example.dc.navigation.models;

import java.io.Serializable;

public class Contact implements Serializable {


    private String contactId;
    private String fullName;
    private String mobileNumber;
    private String personalEmailId;
    private int textDrawbleColor;


    public Contact(String contactId, String fullName, String mobileNumber, String personalEmailId, int textDrawbleColor) {
        this.contactId = contactId;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.personalEmailId = personalEmailId;
        this.textDrawbleColor = textDrawbleColor;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPersonalEmailId() {
        return personalEmailId;
    }

    public void setPersonalEmailId(String personalEmailId) {
        this.personalEmailId = personalEmailId;
    }

    public int getTextDrawbleColor() {
        return textDrawbleColor;
    }

    public void setTextDrawbleColor(int textDrawbleColor) {
        this.textDrawbleColor = textDrawbleColor;
    }
}
