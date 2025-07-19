package com.tech;

public class Quick {
    static void Swap(int[] arr,int i,int j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;

    }
    static int  Partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        int j;
        for( j=low;j<=high-1;j++){
            if(arr[j]<=pivot){
                i=i+1;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return(i+1);
    }
    static void QuickSort(int[]arr,int low,int high){
      if(low<high){
          int mid=Partition(arr,low,high);
          QuickSort(arr,low,mid-1);
          QuickSort(arr,mid+1,high);
      }
    }
    static void Print(int[]arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int[]arr={12, 9,4,24,45,21,36,6};
        int N = arr.length;
        QuickSort(arr,0,N-1);
        System.out.println("sorted array: ");
        Print(arr);

    }
}
