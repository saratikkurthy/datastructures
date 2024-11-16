package com.project.ds.basic;

import java.util.HashMap;

public class PointerValidation {
    public static void intValidation(int num1,int num2){
        num2=num1;
        System.out.println("Values Before Changing");
        System.out.println("Num1="+num1);
        System.out.println("Num2="+num2);
        //Incrementing to num1 after assigning to num2
        num1++;
        //Changes to num2 will not reflect with latest updates
        System.out.println("Values After Changing");
        System.out.println("Num1="+num1);
        System.out.println("Num2="+num2);
    }
    public static void hashMapValidation(HashMap<String,Integer> map1,HashMap<String,Integer> map2){
        map1.put("Value",5);
        System.out.println("Values Before Changing");
        System.out.println("Map1:"+map1);
        System.out.println("Map2:"+map2);
        //Assigned map2 with map1
        map2=map1;
        //Modifying the value of map1 after assigning to map2 and we can see changes reflected in map1
        map1.put("Value",10);
        System.out.println("Values After Changing");
        System.out.println("Map1:"+map1);
        System.out.println("Map2:"+map2);
    }
    public static void main(String[] args){
        int num=5;
        intValidation(num,num);
        HashMap<String,Integer> map1=new HashMap<>();
        hashMapValidation(map1,map1);
    }
}
