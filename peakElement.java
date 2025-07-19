public class peakElement {
    /*public int peak(int []arr,int n){
        if(n==1)
            return 0;
        if(arr[0]>=arr[1])
            return 0;
        if(arr[n-1]>=arr[n-2])
            return n-1;
        for(int i=1;i<=n;i++){
        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
           return i;
        }

        }
        return 0;
    }

     */

    public static int peakElements(int []arr){
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid]+1){
                high = mid;
            }else{
                low = mid+1;
            }

        }
        return low;
    }

    public static void main(String[] args) {

    int []arr ={2,1,3,5,9};
   // int n= arr.length;
   // peakElement p = new peakElement();
        System.out.println("peak point is:" +peakElement.peakElements(arr));
    }
}
