package com.project.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNASequence {
    public static List<String> getDNAStrings(String input) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> dnaMap = new HashMap<>();
        for (int i = 0; i <= input.length() - 10; i++) {
            String subString = input.substring(i, i + 10);
            dnaMap.put(subString, dnaMap.getOrDefault(subString, 0) + 1);
        }
        for (Map.Entry<String, Integer> item : dnaMap.entrySet()) {
            if (item.getValue() > 1) {
                result.add(item.getKey());
            }

        }

        return result;
    }

    public static void main(String[] args){
        String input = "AAAAACCCCCAAAAACCCCCAAAAAGGGTTT";
        System.out.println(getDNAStrings(input));
    }
}
