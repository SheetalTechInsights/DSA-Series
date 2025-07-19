public class SquareRoot {
    public static int  square_root(int x){
        if(x==0|| x==1){
            return x;
        }
        int low=1;
        int high=x;
        int ans=1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==x){
              return mid;
            }else if(mid*mid <x){
                ans=mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    return ans;
    }

    public static void main(String[] args) {
        int x= 9;
        System.out.println(SquareRoot.square_root(x));
    }
}
