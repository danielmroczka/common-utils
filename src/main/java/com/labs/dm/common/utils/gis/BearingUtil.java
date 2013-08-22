/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.common.utils.gis;

/**
 * @author daniel
 */
public class BearingUtil {

    public static double bearing(Position src, Position dest) {
        double latitude1 = Math.toRadians(src.getLatitude());
        double latitude2 = Math.toRadians(dest.getLatitude());
        double longDiff = Math.toRadians(dest.getLongitude() - src.getLongitude());
        double y = Math.sin(longDiff) * Math.cos(latitude2);
        double x = Math.cos(latitude1) * Math.sin(latitude2) - Math.sin(latitude1) * Math.cos(latitude2) * Math.cos(longDiff);

        return (Math.toDegrees(Math.atan2(y, x)) + 360) % 360;
    }
}
