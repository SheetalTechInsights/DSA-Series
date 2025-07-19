package TwoPointersProblem;

public class MaxSumSubArrayByTwoPointers {
    public static int maxSum(int[]arr,int k){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum= sum;
        int left =0;

        for( int right = k;right<n;right++){
            sum = sum-arr[left]+arr[right];
            maxSum = Math.max(maxSum,sum);
            left++;
        }
      return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum of subarray of size " + k + " is: " + maxSum(arr, k));
    }

}
