package com.project.patterns.creational;

import org.junit.Test;
import static org.junit.Assert.*;
public class SingletonTest {
    @Test
    public void testGetInstance(){
       assertNotSame(null,Singleton.getInstance());
       Object obj=Singleton.getInstance();
       assertEquals(obj,Singleton.getInstance());
    }
}
