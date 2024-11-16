package com.project.ds.string;

public class LengthLastWord {
    public static int lengthLastWord(String word) {
        int length = 0;
        int prevLength = 0;
        char[] strArray = word.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != ' ') {
                length++;
                prevLength = length;
            } else {
                length = 0;
            }
        }
        return length>0?length:prevLength;
    }
    public static void main(String[] args){
        String input="Hello world";
        System.out.println(lengthLastWord(input));
        input=" world  ";
        System.out.println(lengthLastWord(input));
        input="   ";
        System.out.println(lengthLastWord(input));
        input="  This is length word with huge spacessss      ";
        System.out.println(lengthLastWord(input));
    }
}
