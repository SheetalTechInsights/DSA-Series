public class CountPrime {
    public static int count(int n){
        if(n<=2){
            return 0;
        }
        boolean []isPrime = new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i] = true;
        }
        for(int i =2;i*i<n;i++){
            if(isPrime[i]){
                
            }
        }

    }
    public static void main(String[] args) {

    }
}
