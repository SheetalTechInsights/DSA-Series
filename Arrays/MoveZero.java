public class MoveZero {
    static void move(int []arr,int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j) {
                    swap(arr, j, i);
                }
                j++;
            }
        }
    }
    public static void swap(int[]arr,int a,int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }
    public static void main(String[] args) {
       int[]arr = {1,0,2,3,0,0,3,4,5};
       int n= arr.length;
       MoveZero.move(arr,n);
       for(int i=0;i<n;i++) {
           System.out.print(arr[i] +" ");
       }
    }
}
