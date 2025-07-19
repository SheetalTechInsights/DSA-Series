import java.util.Arrays;

public class RotateByDPlaces {

   /* public  void rotate(int[]arr,int position){
       int n = arr.length;
       position = position % n;

        int []temp = new int[position];

       for(int i=0;i<position;i++){
           temp[i]=arr[i];
       }

       for(int i=position;i<n;i++){
           arr[i-position]=arr[i];
       }

       for(int i=n-position;i<n;i++){
          arr[i] = temp[i-(n-position)];
       }
    }

    */

    public void rotate(int[]arr,int pos){
        int n = arr.length;
        pos%=n;
        reverse(arr,0,pos-1);
        reverse(arr,pos,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[]arr,int start,int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        int pos =3;
       RotateByDPlaces R = new RotateByDPlaces();
        R.rotate(arr,pos);
        System.out.println(Arrays.toString(arr));
    }
}
