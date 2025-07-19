import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        System.out.println("Sum of Series from 1 to" +" " +n +"is" +" 5" +sum);
        sc.close();
    }
}
