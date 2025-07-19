public class isSorted {
    public boolean sorted(int []arr){
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>=arr[i-1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int []arr = {12,24,65,48,60};
    int n=arr.length;
    isSorted sort = new isSorted();
        System.out.println(sort.sorted(arr));

    }
}
