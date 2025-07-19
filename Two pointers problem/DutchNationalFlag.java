package TwoPointersProblem;

public class DutchNationalFlag {
   /* public static void arrange(int[]arr){
        Arrays.sort(arr);
    }

    */
    public static void DNF(int[]arr){
        int n = arr.length;
        int low =0;int mid=0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
             swap(arr,low,mid);
             mid++;
             low++;
            }
            else if(arr[mid]==1){
               mid++;
            }
            else if(arr[mid]==2){
               swap(arr,mid,high);
               high--;
            }
        }

    }
    public static void swap(int []arr,int start,int  end){
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end] = temp;

    }
    public static void main(String[] args) {
        int []arr ={1,0,1,0,1,1,0,2,1,2};
        DNF(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
