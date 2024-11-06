package com.project.ds;

import java.util.HashMap;

public class FirstRepeatChar {
    public static void main(String[] args){
        String inputStr="responsible";
        char[] inputArr=inputStr.toCharArray();
        HashMap<Character,Boolean> charMap=new HashMap<Character, Boolean>();
        for(char c:inputArr){
            if(charMap.get(c)==null){
                charMap.put(c,true);
            }
            else{
                System.out.println("Found first repeating sequence for character:"+c);
                break;
            }

        }
    }
}
