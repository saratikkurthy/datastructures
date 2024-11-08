package com.project.ds.test;

import com.project.ds.KadanesAlgorithm;
import org.junit.Test;

import static org.junit.Assert.*;

public class KandanesAlgorithTest {
    @Test
    public void testKandanesAlgorithm() {
        int[] nums = {4, -1, 2, -7, 3, 4};
        assertEquals(7, KadanesAlgorithm.maxSubArrayKadane(nums));
        assertEquals(7, KadanesAlgorithm.maxSubArraySumBF(nums));
    }
}
