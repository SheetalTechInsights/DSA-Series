package TwoPointersProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSum {
    public static List<List<Integer>> FourSum(int []arr,int target){
        List<List<Integer>> list = new ArrayList<>();
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]== arr[i-1] ){
                continue;
            }
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && arr[j] == arr[j-1]){
                    continue;
                }

                int start = j+1;
                int end = n-1;

                while(start<end){
                    int sum = arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum == target){
                        list.add(Arrays.asList(arr[i],arr[j],arr[start],arr[end]));
                        while(start<end && arr[start] == arr[start+1])
                            start++;
                        while(start<end && arr[end] == arr[end-1])
                            end--;
                        start++;
                        end--;

                    }
                    else if( sum<target){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }


        }


        return list;
    }
    public static void main(String[] args) {
       int[] arr = {4,1,2,-1,1,-3};
       int target =1;
       List<List<Integer>> list  = QuadrupleSum.FourSum(arr,target);
        System.out.println("Quadruples Sum List: "+list);
    }
}
