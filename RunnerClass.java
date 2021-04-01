package com.section2;

import java.util.HashMap;
import java.util.Map;

public class RunnerClass {
    public static void main(String[] args) {
        CustomizedLinkedList linkedList = new CustomizedLinkedList();
        linkedList.insert(12);
        linkedList.insert(60);
        linkedList.insert(86);
        linkedList.insert(45);
        linkedList.insert(13);
        linkedList.insert(77);

        linkedList.show();

        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(2, "Mango");
        fruits.put(4, "Pine");
        fruits.put(6, "Plum");
        fruits.put(8, "Apple");

        //System.out.println(fruits.get(4));



            System.out.println(fruits.size());
        for (Map.Entry pairEntry : fruits.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

        }
    }

