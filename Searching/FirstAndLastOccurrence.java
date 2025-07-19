package com.tech;

public class FirstAndLastOccurrence {
   public static int searchLb(int[]arr,int target){
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
    public static int searchUb(int[]arr,int target){
        int n=arr.length;
        int low=0;int high=n-1;
        int ans=n;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int []firstAndlast(int[]arr,int number){

       int n= arr.length;
        int lowerBound = searchLb(arr,number);
        if(lowerBound==n || arr[lowerBound]!=number){
            return new int[] {-1,-1};
        }
        int upperBound = searchUb(arr,number)-1;
        return new int [] {lowerBound,upperBound};
    }




    public static void main(String[] args) {
       int []arr ={2,4,6,8,8,10,12};
       int number =8;
        int[] result = firstAndlast(arr, number);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);

    }


}
