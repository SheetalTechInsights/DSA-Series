import static java.lang.Math.max;

public class Consecutive {
    public static int max_consecutive(int[]arr){
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max= max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr = {1,1,0,1,1,1,0,1,1,1,1};

        System.out.println(Consecutive.max_consecutive(arr));
    }
}
