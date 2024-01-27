
/**Write a function solution that returns an arbitrary integer which is greater than N, not greater than 10^9,
 * and that ends with 0. You can assume that N is between 1 and 999,999,999.
 * For example, given N = 27, your function may return 60 and for N = 30, your function may return 40.
 */
public class lastZero {
    public static void main(String[] args) {
        System.out.println(Solution(27));
        System.out.println(Solution(30));
    }
    public static int Solution(int n) {
        if (n < 1 || n > 999999999) {
            throw new IllegalArgumentException("n must be between 1 and 999999999");
        }

        int nextInt = n + 1;
        while (true) {
            if (nextInt > 1000000000) {return nextInt;}
            if (endsWithZero(nextInt)) {return nextInt;}
            nextInt++;
        }
    }
    private static boolean endsWithZero(int n) {
        return n % 10 == 0;
    }
}
