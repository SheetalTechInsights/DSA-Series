public class FindMissingNum {
   /* public static int find(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean found = false;


            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }*/
   /* public static int MissingNum(int[]arr,int range){

        int i=0;
        for(int j =1;j<range;j++){
            if(i<arr.length && arr[i]==j+1){
                i++;
            }
            else{
                return j+1;
            }
        }
        return -1;
    }
*/

    public static int MissingNum(int[]arr,int range){
        int expextedSum = (range*(range+1))/2;
        int actualSum = 0;

        for(int i=0;i<arr.length;i++){
           actualSum+=arr[i];

        }
        return expextedSum-actualSum;
    }
    public static void main(String[] args) {
        int[] array = {0, 1,3};
        int n = 3;

        System.out.println("Missing Number: " + FindMissingNum.MissingNum(array, n));
    }
}





