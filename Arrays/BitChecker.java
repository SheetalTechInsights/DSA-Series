public class BitChecker {

    public static boolean alternate1(int n) {
        if (n <= 0) {
            return false;
        }
        boolean expectedBit = true;
        while (n > 0) {
            boolean currentBit = (n & 1) == 1;
            if (currentBit != expectedBit) {
                return false;
            }
            expectedBit = !expectedBit;
            n = n >> 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Numbers between 0 and 7 with alternate 1s:");

        for (int i = 0; i <= 7; i++) {
            if (alternate1(i)) {
                System.out.println(i + " (binary: " + Integer.toBinaryString(i) + ")");
            }
        }
    }
}
