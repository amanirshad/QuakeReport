package com.amanirshad.quakereport;

public class Earthquake {

    private String mLocation;

    private String mMagnitude;

    private String mDate;

    public Earthquake(String magnitude, String location, String date) {
        mLocation = location;
        mMagnitude = magnitude;
        mDate = date;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }
}
