package TwoPointersProblem;

public class ZerosToEnd {
    public static void move(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++;
            }
        }
    }

    private static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {1,0,3,0,4,0};
        move(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
