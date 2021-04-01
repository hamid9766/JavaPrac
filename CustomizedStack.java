package com.section2;
import java.util.Stack;

public class CustomizedStack {
    int top = -1;
    int[] stack;
    int max_size;

    public CustomizedStack(int size){
        this.max_size = size;
        stack = new int[size];
    }

    public void push(int data) {
        if (isFull())
            System.out.println("Stack is Full");

        else {
            top++;
            stack[top] = data;
        }
    }

    public int pop(){
        int old_data=0;

        if (isEmpty())
            System.out.println("Stack is Empty");

        else
        old_data = top;
        top--;
        stack[top] = 0;
            return stack[old_data];
    }

    public int peek() {
        int data;
        data = stack[top];
        top--;
        return data;
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (max_size -1 == top);
    }

    public void printStack(){
        for (int s : stack)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {
        CustomizedStack sta = new CustomizedStack(6);
        sta.push(2);
        sta.push(5);
        sta.push(6);
        sta.push(8);
        sta.push(66);
        sta.push(88);

        sta.printStack();
        System.out.print("\n" + sta.peek());
        System.out.print("\n" + sta.peek());
        System.out.print("\n" + sta.peek());
        System.out.print("\n" + sta.peek());
        System.out.print("\n" + sta.peek());



    }
}
