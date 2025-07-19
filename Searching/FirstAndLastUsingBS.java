package com.tech;

public class FirstAndLastUsingBS {
    public static int first(int []arr,int number){
        int n=arr.length;
        int first=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==number){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<number){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
     return first;
    }
    public static int last(int []arr,int number){
        int n=arr.length;
        int last =-1;
        int low=0;
        int high =n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==number){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]>number){
              high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
    public static int[] firstAndlast(int []arr,int number){
        int n=arr.length;
        int first = first(arr,number);
        if(first==n ||arr[first]!=number){
            return new int[]{-1,-1};
        }
        int last = last(arr,number);
        return new int[]{first,last};
    }
    public static void main(String[] args) {
    int []arr = {2,4,8,8,8,8,8,10,11};
    int num = 8;
        int[] result = firstAndlast(arr, num);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
