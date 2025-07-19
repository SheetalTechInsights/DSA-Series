public class MoveZerosEnd {

    static void Move(int []arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
                //count++;
            }
        }
        while(count<n){
            arr[count++]=0;
        }

    }
    public static void main(String[] args) {
    int []arr = {1,0,2,3,2,0,0,4,5};
    int n=arr.length;
    MoveZerosEnd.Move(arr,n);
    for(int i=0;i<n;i++) {
        System.out.print(arr[i]+" ");
    }
    }
}
