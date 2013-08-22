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
}