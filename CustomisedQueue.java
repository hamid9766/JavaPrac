package com.section2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CustomisedQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList();

        //peek() is used instead of element()
        //offer keyword used instead of add keyword as add throws exception
        q.offer(2);
        q.offer(1);
        q.offer(3);
        q.offer(4);

        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.println();

    }
}
