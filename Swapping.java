package com.section2;

public class Swapping {
    int n;
    int m;

    static void identicalMatrix(int x[][], int y[][]){
        int i,j;
        for(i = 0; i<x.length; i++){
            for(j = 0;  j<y.length; j++){
                if (x[i][j] == y[i][j]){
                    System.out.println("Matrix is identical");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] a= {{2 , 2}, {3 , 3}, {4 , 4}};
        int[][] b= {{2 , 2}, {3 , 3}, {4 , 4}};

        //String result = identicalMatrix(a,b);
       // System.out.println(identicalMatrix(a,b));
    }
}
