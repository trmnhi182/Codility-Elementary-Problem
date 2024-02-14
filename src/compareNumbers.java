/**
 * There is an array A of N integers. Compare each pair of neighbouring integers. Add '<' to the
 * output string if the left number is smaller; add '>' to the string if the left number is larger;
 * or add '=' to the string if the numbers are equal. Write a function that, given an array A,
 * returns a string describing the results of comparing all the consecutive pairs of numbers in A.
 */
public class compareNumbers {
    public static void main(String[] args) {
        int[] a = {18, 2, 6, 4};
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] c = {4, 3, 6, 6, 3};
        int[] d = {3, 2, 1, 1, 2, 3};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));
    }

    public static StringBuffer solution(int[] array) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < array.length-1; i++) {
            int leftNumber = array[i];
            int rightNumber = array[i + 1];
            if (leftNumber < rightNumber) {
                s.append("<");
            } else if (leftNumber > rightNumber) {
                s.append(">");
            } else {
                s.append("=");
            }
        }
        return s;
    }
}
