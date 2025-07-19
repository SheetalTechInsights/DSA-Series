public class RatAndFood {
    public static int AmountOfFood(int []arr,int unit,int r){
        int n = arr.length;
        int target = r*unit;
        int sum =0;
        for(int i=0;i<n;i++){
            if(sum>=target){
                return i+1;
            }
        }
        return -1;// not sufficient food available
    }
    public static void main(String[] args) {
        int r = 7;
        int unit =2;
        int []arr = {1,3,5,9};
        System.out.println("Amount of food:"+RatAndFood.AmountOfFood(arr,unit,r));
    }
}
