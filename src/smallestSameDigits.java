/**Write a function solution that, given an integer N, returns the smallest number with the same number of digits.
 * You can assume N is between 1 and 10^9 (a billion).
 For example, given N = 125, the function should return 100. Given N = 10, the function should return 10. Given N = 1,
 the function should return 0.
 */
public class smallestSameDigits {
    public static void main(String[] args){
        System.out.println(Solution(4751));
        System.out.println(Solution(189));
        System.out.println(Solution(-37));
        System.out.println(Solution(1));
    }

    public static int Solution(int number){
        int numberOfDigits = (int) String.valueOf(Math.abs(number)).length();
        if (number >= 0) {
            if (numberOfDigits == 1) {
                return 0;
            } else {
                return (int) Math.pow(10, numberOfDigits - 1);
            }
        } else
            return -1 ;
    }
}
