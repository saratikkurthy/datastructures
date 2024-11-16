package com.project.ds.test;

import com.project.ds.numeric.PalindromeNumber;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalindromeNumberTest {
    @Test
    public void testIsPalindrome(){
        assertEquals(true, PalindromeNumber.isPalindrome(34543));
    }
}
