package TwoPointersProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> sum(int []arr){
        Arrays.sort(arr);
        List<List<Integer>> list  = new ArrayList<>();

        int n = arr.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i] == arr[i-1]){ //skip duplicates
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == 0){
                    list.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    while(left<right && arr[left] == arr[left+1])
                        left++;
                    while(left<right && arr[right] == arr[right-1])
                        right--;
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

    return list;
    }
    public static void main(String[] args) {
         int[] arr = {-1,0,1,2,-1,-4};
         List<List<Integer>> list = ThreeSum.sum(arr);
        System.out.println("Unique Triplets " +list);
    }
}
