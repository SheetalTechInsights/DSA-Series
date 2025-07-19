public class AddWithoutSumOperator {

    public static int add(int num1,int num2){
        int carry = num1&num2;
        num1 = num1^num2;
        num2 = carry<<1;

        return num2;
    }
    public static void main(String[] args) {
     int num1 = 16;
     int num2 = 20;
        System.out.println("Sum Is:"+AddWithoutSumOperator.add(num1,num2));
    }
}
