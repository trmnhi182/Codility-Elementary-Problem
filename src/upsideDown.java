/**
 * You are given a positive integer consisting only of digits 6 and 9.
 * Find the maximum value that can be achieved by turning at most one digit upside down
 * (6 becomes 9 and 9 becomes 6).
 * For example, given integer 696:
 * Turning the first digit upside down (6 ➔ 9) would result in the number 996.
 * Turning the second digit upside down (9 ➔ 6) would result in the number 666.
 * Turning the third digit upside down (6 ➔ 9) would result in the number 699.
 * The maximum value among 696, 996, 666 and 699 is 996.
 * <p>
 * Write a function that, given an integer A, returns the maximum integer that can be achieved
 * by turning upside down at most one digit in A.
 */
public class upsideDown {
    public static void main(String[] args) {
        System.out.println(solution(6699));
        System.out.println(solution(696));
    }

    public static int solution(int number) {
        String stringValue = String.valueOf(number);
        int max = number;
        boolean isFlipped = false;

        for (int i = 0; i < stringValue.length(); i++) {
            char[] digit = stringValue.toCharArray();
            if (digit[i] == '6') {
                digit[i] = '9';
                isFlipped = true;
            } else if (digit[i] == '9') {
                digit[i] = '6';
                isFlipped = true;
            }

            int current = Integer.parseInt(String.valueOf(digit));
            max = Math.max(max, current);
        }

        if (!isFlipped) {
            return number;
        }

        return max;
    }
}