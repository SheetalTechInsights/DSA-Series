package com.tech;

public class FloorAndCeil {
    public static int ceil(int []arr,int target){
     //ceil is the smallest number in the array which is >=number/target
        int  n = arr.length;
        int low =0;
        int high = n-1;
        int ceil =n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ceil=arr[mid];
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ceil;
    }
    public static int floor(int []arr,int number){
        //FLOOR IS THE LARGEST ELEMENT IN THE ARRAY WHICH IS <= TARGET
        int n= arr.length;
        int low=0;
        int high=n-1;
        int floor=n;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if(arr[mid]<=number){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
      int []arr = {2,4,6,8,10};
      int target = 7;
        System.out.println("ceil value is:" +FloorAndCeil.ceil(arr,target));
        System.out.println("floor of the number is:" +FloorAndCeil.floor(arr,target));
    }
}
