import java.util.HashMap;
import java.util.HashSet;

public class FruitsIntoBasket {
    //TODO:BRUTE FORCE APPROACH:
    /*public static int max_length(int[]arr){
        int n = arr.length;
        int max_length = 0;
        for(int i =0;i<n;i++) {

            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){
                set.add(arr[j]);
                if(set.size() <= 2){
                    max_length=Math.max(max_length,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return max_length;
    }

     */
    //TODO:SLIDING WINDOW APPROACH:
    public static int max_length(int[]arr){
        int n = arr.length;
        int max_length =0;
        int start =0;
        HashMap<Integer,Integer>fruit_count =  new HashMap<>();
        for(int end =0;end<n;end++){
            fruit_count.put(arr[end],fruit_count.getOrDefault(arr[end],0)+1);
            while(fruit_count.size()>2){
                int fruitsAtStart = arr[start];
                fruit_count.put(fruitsAtStart,fruit_count.get(fruitsAtStart)-1);
                if(fruit_count.get(fruitsAtStart)==0){
                    fruit_count.remove(fruitsAtStart);
                }
                start++;
            }
            max_length= Math.max(max_length,end-start+1);
        }
        return max_length;
    }
    public static void main(String[] args) {
     int []arr = {3,3,3,1,2,1,1};
        System.out.println(FruitsIntoBasket.max_length(arr));
    }
}
