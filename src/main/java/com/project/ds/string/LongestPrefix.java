package com.project.ds.string;

public class LongestPrefix {
    /**
     * @param strings
     * @return
     */
    public static String longestPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] strings = {"Test", "Testing", "TestResults"};
        String prefix = longestPrefix(strings);
        System.out.println(prefix);

    }
}
