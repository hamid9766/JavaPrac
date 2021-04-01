package com.section2;
import java.util.LinkedList;

public class CustomizedLinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;

        if (head==null){
            head = node;
        }
        else {
            Node n = head;
            while(n.next!=null)
            {
              n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node n = head;
        while (n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

}

class Node{
    int data;
    Node next;
}
