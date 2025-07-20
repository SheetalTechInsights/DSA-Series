public class Window_Sum {
    public static int max_sum(int []arr,int k){
        int n=arr.length;
        int maxSum=0;
        int current_sum=0;
        for(int i=0;i<k;i++){
            maxSum+=arr[i];
        }
        current_sum=maxSum;
        for(int i=k;i<n;i++){
            current_sum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,current_sum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
       int[]arr = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
       int k =4;
        System.out.println(Window_Sum.max_sum(arr,k));
    }
}
