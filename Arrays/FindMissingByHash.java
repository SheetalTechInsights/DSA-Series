public class FindMissingByHash {
    public static int find(int []arr,int n){
        int []hash = new int[n+1];
        for (int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[]arr = {1,3,4,5};
    int n=arr.length;
        System.out.println(FindMissingByHash.find(arr,n));
    }
}
