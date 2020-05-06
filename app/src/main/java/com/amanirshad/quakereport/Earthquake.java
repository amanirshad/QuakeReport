package com.amanirshad.quakereport;

import java.util.Date;

public class Earthquake {

    private String mLocation;

    private float mMagnitude;

    private String mDate;

    public Earthquake(String location, float magnitude, String date){
        mLocation = location;
        mMagnitude = magnitude;
        date = mDate;
    }

    public String getLocation() {
        return mLocation;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }
}
