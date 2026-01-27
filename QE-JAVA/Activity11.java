package com.example;

import java.util.HashMap;


public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> myList=new HashMap<>();
        myList.put(1,"blue");
        myList.put(2,"green");
        myList.put(3,"lal");
        myList.put(4,"hara");
        myList.put(5,"peela");
        
        System.out.println(myList.remove(10));
        
        if(myList.containsValue("hara")){
            System.out.println(true);
        }
        System.out.println(myList);
    }
}
