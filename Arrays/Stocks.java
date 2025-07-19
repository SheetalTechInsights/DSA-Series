public class Stocks {
    public static  int maxProfit(int[]arr){
        int n = arr.length;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit = arr[j]-arr[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,8};
        System.out.println("Maximum profit :"+Stocks.maxProfit(arr));
    }
}
