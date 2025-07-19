import java.util.Arrays;

public class RotateByPosition {
    public int[] rotate(int[]arr,int pos){
        int n = arr.length;
        pos=pos%n;  //handles the case when  position is greater than array size
        int k=0;
        //to store rotated result we create a temp array
        int []temp = new int[n];
        //copying elements from original array to temp array
        for(int i=pos;i<n;i++){
            temp[k++]=arr[i];
        }
        // shifting array elements
        for(int i=0;i<pos;i++){
            temp[k++]=arr[i];
        }

        //copying back to original array
       for(int i=0;i<n;i++){
           arr[i]=temp[i];
       }

        return arr;
    }
    public static void main(String[] args) {

        int []arr = {4,5,6,7,1,2,3};
        int pos =3;
        RotateByPosition R = new RotateByPosition();
        R.rotate(arr,pos);
        System.out.println(Arrays.toString(arr));
    }
}
