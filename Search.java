public class Search {
    static int LinearSearch(int[]arr,int num){
        int n=arr.length;
        for(int i=0;i<n;i++) {
            if (arr[i] == num){
              return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {12,24,36,4,7};
        int num =7;
        System.out.println("Number find at index:" +LinearSearch(arr,num));

    }
}
