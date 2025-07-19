import static java.lang.Math.abs;

public class MaximumBetweenTwo {
    public static int max(int num1,int num2){
        //Without using comparison operator
        int max = ((num1+num2)+Math.abs(num1-num2))/2;
        return max;
    }
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 20;
        System.out.println("Maximum number is: "+MaximumBetweenTwo.max(num1,num2));
    }
}
