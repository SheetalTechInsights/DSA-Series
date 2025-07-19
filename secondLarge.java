public class secondLarge {
    public int largest(int []arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > large) {
                secLarge = large;
                large = j;
            } else if (j > secLarge && j != large) {
                secLarge = j;
            }
        }

        return secLarge;
    }
    public static void main(String[] args) {
     int []arr = {12,3,8,23,1};
     secondLarge s = new secondLarge();
     System.out.println("Second largest element is:" +s.largest(arr));
    }
}
