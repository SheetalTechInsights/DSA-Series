package com.tech;

public class IterativeBinary {
    int binarySearch(int arr[],int low,int high,int key){
        while(low<=high){
            int mid=low + (high - low) / 2;
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]>key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        IterativeBinary ob=new IterativeBinary();
        int []arr={10,20,30,40,50};
        int size= arr.length;
        int key=30;
        int result=ob.binarySearch(arr,0,size-1,key);
        if(result==-1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found successfully at index: "+result);


    }
}
