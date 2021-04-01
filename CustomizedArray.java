package com.section2;

import java.util.Arrays;

public class CustomizedArray {
    private int[] items;
    private int count;

    public CustomizedArray(int length){
        items = new int[length];
    }

    public void printData(){
        for (int i =0; i<count; i++)
            System.out.print(items[i] +" ");
        //System.out.println(Arrays.toString(items) + " ");
    }

    public void insert(int number){
        if(items.length == count){
            int[] newArr = new int[count * 2];

            for (int i =0 ; i<count; i++)
                newArr[i] = items[i];
                items = newArr;
        }
        items[count++] = number;
    }

    public void removeAt(int index){
        if(index<0 || index >=count )
            throw new IllegalArgumentException();

        for (int i = index ; i< count ; i++)
            items[i] = items[i+1];
            count--;
    }

    public int indexOf(int number){
        for (int i = 0; i<count; i++){
            if (items[i]==number)
                return i;
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        CustomizedArray arr = new CustomizedArray(4);
        arr.insert(56);
        arr.insert(46);
        arr.insert(36);
        arr.insert(26);
        arr.insert(16);

      //  arr.removeAt(1);
        arr.printData();

        System.out.println();
        arr.removeAt(2);
        arr.printData();

        System.out.println("Index Of --" + "\n"+ arr.indexOf(46));

    }
}
