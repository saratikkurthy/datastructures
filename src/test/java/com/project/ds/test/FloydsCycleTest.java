package com.project.ds.test;
import static org.junit.Assert.*;

import com.project.ds.FloydsCycle;
import org.junit.Test;

public class FloydsCycleTest {
    @Test
    public void testFindDuplicate(){
        int[] arr = {2, 3, 4, 1, 5, 3, 7};
        assertEquals(3, FloydsCycle.findDuplicate(arr));
    }
}
