package com.tech;

public class SearchPosition {
    public static int search(int[]arr,int target){
        int n= arr.length;
        int low=0;
        int high =n-1;
        int ansIndex=n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                ansIndex=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ansIndex;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,2,2,3,5,6};
        int target = 4;
        System.out.println("Insertion index : "+SearchPosition.search(arr,target));
    }
}
