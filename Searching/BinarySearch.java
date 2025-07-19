package com.tech;//import java.util.Scanner;


public class BinarySearch {
    int binarySearch(int[] arr, int low, int high, int key) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);


            return binarySearch(arr, mid + 1, high, key);

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob=new BinarySearch();
        int []arr={12,24,36,48,60,72};
        int size=arr.length;
        int key=48;
        int result=ob.binarySearch(arr,0,size-1,key);
        if(result==-1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found successfully at index: "+result);

    }
}