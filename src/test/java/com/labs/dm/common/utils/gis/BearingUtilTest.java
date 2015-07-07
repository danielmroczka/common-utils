/*
 * Copyright daniel.mroczka@gmail.com. All rights reserved. 
 */
package com.labs.dm.common.utils.gis;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author daniel
 */
public class BearingUtilTest {

    @Test
    public void shouldBearingEqualZeroBetweenTheSamePos() {
        //GIVEN
        Position pos1 = new Position(0, 0);
        Position pos2 = new Position(0, 0);
        //WHEN
        double result = BearingUtil.bearing(pos1, pos2);
        //THEN
        assertEquals(0d, result, 0d);
    }

    @Test
    public void shouldBeringOnNorth() throws Exception {
        //GIVEN
        Position pos1 = new Position(60, 10);
        Position pos2 = new Position(50, 10);
        //WHEN
        double result = BearingUtil.bearing(pos1, pos2);
        //THEN
        assertEquals(180d, result, 0d);
    }

    @Test
    public void shouldBeringOnWest() throws Exception {
        //GIVEN
        Position pos1 = new Position(0, 10);
        Position pos2 = new Position(0, 0);
        //WHEN
        double result = BearingUtil.bearing(pos1, pos2);
        //THEN
        assertEquals(270d, result, 0d);
    }

}