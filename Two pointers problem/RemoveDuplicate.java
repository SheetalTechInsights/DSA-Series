package TwoPointersProblem;

public class RemoveDuplicate {
    public static int duplicate(int []arr){

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){  // unique element
                i++;
                arr[i] = arr[j];   // move unique elements
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
      int []arr = {1,1,2,2,3,3,4,5,6};
      int newArray = RemoveDuplicate.duplicate(arr);
      for(int i=0;i<newArray;i++) {
          System.out.println(arr[i]+" ");
      }
    }
}
