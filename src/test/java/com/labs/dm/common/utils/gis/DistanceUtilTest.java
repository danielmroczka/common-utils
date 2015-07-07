/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.common.utils.gis;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author daniel
 */
public class DistanceUtilTest {
    
    @Test
    public void shouldDistanceEqualZeroBetweenTheSamePos() {
        //GIVEN
        Position pos1 = new Position(0, 0);
        Position pos2 = new Position(0, 0);
        //WHEN
        double result = DistanceUtil.calculateDistance(pos1, pos2);
        //THEN
        assertEquals(0d, result, 0d);
    }

    @Test
    public void shouldResultTheSameValueBothSide() {
        //GIVEN
        Position pos1 = new Position(50, 20);
        Position pos2 = new Position(60, 10);
        //WHEN
        double result1 = DistanceUtil.calculateDistance(pos1, pos2);
        double result2 = DistanceUtil.calculateDistance(pos2, pos1);
        //THEN
        assertEquals(result1, result2, 0d);
    }
}