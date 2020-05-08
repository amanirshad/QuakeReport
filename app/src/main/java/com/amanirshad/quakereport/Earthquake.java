package com.amanirshad.quakereport;

public class Earthquake {

    private String mLocation;

    private String mMagnitude;

    private long mTimeInMilliSeconds;

    public Earthquake(String magnitude, String location, long timeInMilliSeconds) {
        mLocation = location;
        mMagnitude = magnitude;
        mTimeInMilliSeconds = timeInMilliSeconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}
