import java.util.Arrays;

public class Average {
   /* public static double[] substring_Average(int[]arr,int k){
        int n= arr.length;

        double []result = new double[n-k+1];
        int length=arr.length;
        for(int i=0;i<n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            result[i]=(double)sum/k;
        }
     return result;
    }

    */
    public static double substring_Average(int []arr,int size){
        int n=arr.length;
        int window_start=0;
        double window_sum=0;
        double maxAverage=Double.NEGATIVE_INFINITY;

        for(int window_end=0;window_end<n;window_end++){
            window_sum+=arr[window_end];
            if(window_end>=size-1){
                double currAverage =window_sum/size;
                maxAverage =Math.max(currAverage,maxAverage);
                window_sum-=arr[window_start];
                window_start++;
            }
        }
        return maxAverage;
    }
    public static void main(String[] args) {
    int[]arr = {1, 12, -5, -6, 50, 3};
    int k=4;
        System.out.println((Average.substring_Average(arr,k)));
    }
}