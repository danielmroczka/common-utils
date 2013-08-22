/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.common.utils.gis;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author daniel
 */
public class Position {

    private double latitude;
    private double longitude;

    /**
     * Creates position object using decimal degrees parameters
     * 
     * @param latitude in decimal degrees 
     * @param longitude in decimal degrees 
     */
    public Position(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
   
   /**
     * Creates position object using degrees-minutes-seconds format
     * 
     * @param latitude in degrees-minutes-seconds format
     * @param longitude in degrees-minutes-seconds format
     */  
    public Position(String latitude, String longitude) {
        throw new NotImplementedException();
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
