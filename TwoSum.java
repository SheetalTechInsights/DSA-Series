import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*public static int[] twoSumIndices(int[]arr,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
         if(map.containsKey(target-arr[i])){
             return new int[]{map.get(target-arr[i]),i};
         }
         map.put(arr[i],i);
        }
        return new int[]{};
    }
    */

    public static int[] twoSumUsingPointers(int[]arr,int target){
        Arrays.sort(arr);
        int left  = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                return new int[]{left,right};
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
     int[] arr = {2,6,5,8,11};
     int target = 14;

        System.out.println("indices of two sum numbers: "+ Arrays.toString(TwoSum.twoSumUsingPointers(arr,target)));
    }
}
