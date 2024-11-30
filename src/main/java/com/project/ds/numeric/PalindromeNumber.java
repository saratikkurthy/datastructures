package com.project.ds.numeric;

public class PalindromeNumber {
    public static boolean isPalindrome(int number){
        int x=number;
        int reverse=0;
        if(number<0 || (number!=0 && number%10==0))
            return false;
        while (number!=0){
            int lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        return (x==reverse/10 || x==reverse);
    }
}
