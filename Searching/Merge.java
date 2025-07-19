package com.tech;

public class Merge {
  void Merging(int arr[],int p,int q,int r)
  {
      //find size of two sub arrays
      int n1=q-p+1;
      int n2=r-q;
     //initialize temp arrays
     int L[]=new int[n1];
     int R[]=new int[n2];
     //copy elements to temp arrays
      for(int i=0;i<n1;i++){
        L[i]=arr[p+i];
      }
      for(int j=0;j<n2;j++){
          R[j]=arr[q+1+j];
      }
      //initialize index of merged sub array
      int i=0;
      int j=0;
      int k=p;
      while(i<n1 && j<n2){
         if(L[i]<=R[j]){
             arr[k]=L[i];
             i++;
         }
         else{
             arr[k]=R[j];
             j++;
         }
         k++;
      }
      while(i<n1){
         arr[k]=L[i];
         i++;
         k++;
      }
      while(j<n2){
          arr[k]=R[j];
          j++;
          k++;
      }
  }
  void Sort(int arr[],int p,int r){
      if(p<r){
          int q=p+(r-p)/2;
          Sort(arr,p,q);
          Sort(arr,q+1,r);
          Merging(arr,p,q,r);
      }
  }
  static void Print(int []arr){
      int n=arr.length;
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");

      }
  }
  public static void main(String []args){
      int arr[]={10,20,30,40,1,5,6,9};
      System.out.println("Given array is");
      Print(arr);

      Merge ob = new Merge();
      ob.Sort(arr, 0, arr.length - 1);

      System.out.println("\nSorted array is");
      Print(arr);
  }
}
