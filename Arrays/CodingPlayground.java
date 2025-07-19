import java.util.Scanner;

public class CodingPlayground {

    //TODO: Write a program to add all the digits of a given number
    static int sumOfDigits(int num) {
        int sum =0;
        while(num!=0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int result = sumOfDigits(input);

        System.out.println("Sum of digits is "+ result);
    }
}
