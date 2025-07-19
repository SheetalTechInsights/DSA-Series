package TwoPointersProblem;

import java.util.Arrays;

public class SquareSortedArray {
    public static int[] Square(int[]arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;


        int index = n-1;
        int []result = new int[n];

        while(start<=end){
            int startSquare =arr[start]*arr[start];
            int endSquare = arr[end]*arr[end];

            if(startSquare > endSquare){
                result[index] = startSquare;
                start++;
            }
            else{
                result[index] = endSquare;
                end--;
            }
            index--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-7, -3, 2, 3, 11};
        int[] squaredArray = SquareSortedArray.Square(arr);
        System.out.println("Sorted Squares: " + Arrays.toString(squaredArray));
    }
}
