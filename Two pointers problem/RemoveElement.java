package TwoPointersProblem;

public class RemoveElement {
    public static int Remove(int[]arr,int key){
        int i=0;
        for(int j =0;j<arr.length;j++){
            if(arr[j]!=key){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
     int []arr = {3, 2, 2, 3, 4, 3, 5};
     int key = 3;
     int newArray = RemoveElement.Remove(arr,key);
     for(int i=0;i<newArray;i++) {
         System.out.println(arr[i] +"");
     }
    }
}
