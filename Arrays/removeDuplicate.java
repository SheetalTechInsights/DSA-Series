import java.util.Arrays;
import java.util.HashSet;

class removeDuplicates {
   /* public  int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j<= nums.length - 1; j++) {
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    */



    int[] removeDuplicates(int []nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }
        int[]uniqueArray = new int[set.size()];
        int i=0;
        for(int num:set){
            uniqueArray[i++] = num;
        }
        return uniqueArray;


        
    }



    public static void main(String[] args) {
        int[] nums = {1, 1, 2,2,3};
        removeDuplicates r = new removeDuplicates();
        System.out.println(Arrays.toString(r.removeDuplicates(nums)));
}
}