package com.tech;

public class SearchInRotatedArray {
    public static int search(int[]arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            }
            if (arr[low] <= arr[mid]) {

                if (arr[low] <= mid && target <= arr[mid]) {

                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid]< mid  && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Element is present at index:" +SearchInRotatedArray.search(arr,target));
    }
}
