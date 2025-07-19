public class Reverse {
    public int reverse(int x) {
        int rem;
        int rev=0;
        while(x!=0){
            rem=x%10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x =123;
        Reverse r = new Reverse();
        System.out.println(r.reverse(x));
    }
}
