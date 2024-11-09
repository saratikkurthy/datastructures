package com.project.ds.test;

import com.project.ds.stack.MyStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testStack() {
        MyStack testStack = new MyStack(5);
        assertEquals(1, testStack.getHeight());
        assertEquals(5, testStack.getTop());
        testStack.push(7);
        assertEquals(2, testStack.getHeight());
        assertEquals(7, testStack.getTop());
        testStack.push(8);
        testStack.push(3);
        testStack.push(9);
        assertEquals(5, testStack.getHeight());
        assertEquals(9, testStack.getTop());
        testStack.pop();
        assertEquals(4, testStack.getHeight());
        assertEquals(3, testStack.getTop());


    }
}
