public class Rotate {
    public int[] leftRotate(int []arr){
        int n=arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
         arr[n-1] = temp;
        return arr;
    }



    public static void main(String[] args) {
       int []arr = {12,2,3,4,65,32,24};
       Rotate r = new Rotate();
       int[] rotatedArray = r.leftRotate(arr);

        // Print the rotated array
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }

    }


}
