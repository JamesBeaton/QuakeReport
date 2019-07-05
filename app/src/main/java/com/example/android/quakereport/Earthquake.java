package com.example.android.quakereport;

/**
 * Created by james.beaton on 24/04/2018.
 */

public class Earthquake {

    /** define 3 global variables of type string*/
    /**
     * Magnitude of earthquake
     */
    private double mMagnitude;
    /**
     * Location of earthquake
     */
    private String mLocation;
    /**
     * Date of the earthquake
     */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * create public constructor and initialise the three member variables
     * based on the values passed into the constructor
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    /**
     * create public getter methods for each private global
     * variable so that other classes can access them
     */
    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl(){
        return mUrl;
    }
}