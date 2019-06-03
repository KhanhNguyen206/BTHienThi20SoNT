public class CountPrime {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int count=0;
        for (int i = 0; count < 20; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
