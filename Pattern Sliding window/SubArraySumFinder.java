public class SubArraySumFinder {
    public static int min_subarray(int[]arr,int target) {
        int n = arr.length;
        int start = 0;
        int length = Integer.MAX_VALUE;
        int curr_sum = 0;
        for (int end = 0; end < n; end++) {
            curr_sum += arr[end];

        while (curr_sum >= target) {
            length = Math.min(curr_sum, end - start + 1);
            curr_sum-=arr[start];
            start++;
        }
    }
        return length;
    }
    public static void main(String[] args) {
    int[]arr = {2, 3, 1, 2, 4, 3};
    int target = 7;
        System.out.println(SubArraySumFinder.min_subarray(arr,target));
    }
}
