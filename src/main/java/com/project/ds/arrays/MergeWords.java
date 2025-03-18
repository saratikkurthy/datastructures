package com.project.ds.arrays;

public class MergeWords {
    public String mergeAlternately(String word1, String word2) {
        int minLen=Math.min(word1.length(),word2.length());
        char[] mergedChar=new char[word1.length()+word2.length()];
        int i=0;
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        int mergedCharIdx=0;
         while (i<minLen){
             mergedChar[mergedCharIdx] = char1[i];
             mergedCharIdx++;
             mergedChar[mergedCharIdx] = char2[i];
             mergedCharIdx++;
             i++;
        }
         if(word1.length()<word2.length()) {
             for (int j = i; j < word2.length(); j++) {
                 mergedChar[mergedCharIdx] = char2[j];
                 mergedCharIdx++;
             }
         }
        else if(word2.length()<word1.length()) {
            for (int j = i; j < word1.length(); j++) {
                mergedChar[mergedCharIdx] = char1[j];
                mergedCharIdx++;
            }
        }
       return String.valueOf(mergedChar);
    }
    public static void main(String... args){
        String word1="abcd";
        String word2="pq";
        MergeWords obj=new MergeWords();
        System.out.println(obj.mergeAlternately(word1,word2));
    }
}
