package com.section2;

public class Array {

    int[][][] unitsold = new int[][][]{
            {
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 850, 0, 0}
            },
            {
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
            },
            {
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}, 
                    {0, 0, 0, 0}
            },
            {
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}

            }
    };

    void printArray(){
        System.out.println("unitsold[0][3][1]:" + unitsold[0][3][1]);
    }
    public static void main(String[] args){
        Array a = new Array();
        a.printArray();
    }
}

