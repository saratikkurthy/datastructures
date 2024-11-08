package com.project.ds.test;
import static org.junit.Assert.*;

import com.project.ds.SingleNumberExtract;
import org.junit.Test;

public class SingleNumberExtractTest {
    @Test
    public void testFindSingle(){
        int[] nums={5,2,4,3,2,4,5};
        assertEquals(3, SingleNumberExtract.findSingle(nums));
    }
}
