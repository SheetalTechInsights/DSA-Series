public class largestElement {
    public int largest(int []arr){
        int large = arr[0];
        for(int  i=0;i<arr.length;i++){
            if(arr[i]>large)
                large = arr[i];
        }
    return large;

    }
    public static void main(String[] args){
        int []arr={10,3,54,2,8};
        largestElement l = new largestElement();
        System.out.println("Largest Element is:" +l.largest(arr));

    }
}
