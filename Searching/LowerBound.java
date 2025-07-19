package com.tech;

public class LowerBound {
    public static int search(int[]arr,int target){
        int n= arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high) {
            int mid = low+(high-low)/2;
          if(arr[mid]>=target){
              ans=mid;
              high=mid-1;
          }
          else{
              low=mid+1;
          }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,3,5,8,8,10,10};
        int target = 3;
        System.out.println("Index of lower bound: "+LowerBound.search(arr,target));
    }
}
