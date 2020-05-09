package com.amanirshad.quakereport;

public class Earthquake {

    private String mUrl;

    private String mLocation;

    private double mMagnitude;

    private long mTimeInMilliSeconds;

    public Earthquake(double magnitude, String location, long timeInMilliSeconds, String url) {
        mLocation = location;
        mMagnitude = magnitude;
        mTimeInMilliSeconds = timeInMilliSeconds;
        mUrl = url;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
