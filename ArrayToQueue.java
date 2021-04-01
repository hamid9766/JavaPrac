package com.section2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayToQueue {
    public static void main(String[] args) {
        String[] names = {"Hamid", "Aman", "rushi", "Vivek"};

        Queue<String> q = new LinkedList<>();

        Collections.addAll(q,names);
        System.out.println(q);
    }
}
