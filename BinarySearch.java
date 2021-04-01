package com.section2;

public class BinarySearch {
    static int index(int[] array, int key , int low , int high ){
        int max = Integer.MAX_VALUE;

        while (low<=high){
            int mid = (low +high)/2;
            if (array[mid]==key) return mid;
            else if (array[mid]<key) low = mid +1;
            else if (array[mid]>key) high = mid -1;
            break;
        }
        return max;
    }
    public static void main(String[] args){
        index(new int[]{1,2,3,4,5,6}, 4, 0, 6);
    }
}
