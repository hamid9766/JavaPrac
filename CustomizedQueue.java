package com.section2;

public class CustomizedQueue {
    int[] queue;
    int front,rear,size;

    public CustomizedQueue(int i) {
        queue = new int[i];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty(){
        boolean response = false;
        if(size==0)
            response = true;
        return response;
    }

    public boolean enqueue(int element){
        boolean response = false;
        if (rear != queue.length-1){
            rear++;
            queue[rear] = element;
            size++;
            response = true;
        }
        return response;
    }

    public int dequeue(){
        int response = 0;
        if (size!=0){
            front++;
            response = queue[front];
            size--;
        }
        return response;
    }

    public int peek(){
        int response = 0;
        if(!isEmpty())
            response = queue[front + 1];
        front++;
        return response;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        CustomizedQueue cs= new CustomizedQueue(6);

        cs.enqueue(20);
        cs.enqueue(10);
        cs.enqueue(30);
        cs.enqueue(40);
        cs.enqueue(60);
        System.out.println( cs.getSize());
        System.out.println( cs.peek());
        System.out.println( cs.peek());
        System.out.println( cs.peek());
        System.out.println( cs.peek());
        System.out.println( cs.peek());

        System.out.println("\n"+ cs.getSize());
        System.out.println(cs.dequeue() + " Deleting 1");
        System.out.println(cs.dequeue() + " Deleting 2");
        System.out.println("\n"+ cs.getSize());
    }

    public static class Main {
        CustomizedQueue  csm = new CustomizedQueue(6);
    }
}

