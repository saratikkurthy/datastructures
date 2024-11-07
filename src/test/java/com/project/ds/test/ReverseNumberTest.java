package com.project.ds.test;

import com.project.ds.ReverseNumber;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testReverse() {
        assertEquals(5431, ReverseNumber.reverse(1345));
        assertEquals(321, ReverseNumber.reverse(1230));
    }
}
