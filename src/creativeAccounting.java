/**There is a company that has a very creative way of managing its accounts. Every time they want to write
 * down a number, they shuffle its digits in the following way: they alternatively write one digit from the front of
 * the number and one digit from the back, then the second digit from the front and the second from the back, and so
 * on until the length of the shuffled number is the same as that of the original.
 * Write a function that, given a positive integer A, returns its shuffled representation. For example, given A = 123456
 * the function should return 162534. Given A = 130 the function should return 103.*/
public class creativeAccounting {
    public static void main(String[] args){
        System.out.println(solution(123456));
        System.out.println(solution(18020604));
        System.out.println(solution(182));
        System.out.println(solution(64));
        System.out.println(solution(000001));
    }
    public static int solution(int A){
        String strA = String.valueOf(A);
        int length = strA.length();
        StringBuilder shuffled = new StringBuilder(length);
        for (int i = 0; i < length / 2; i++) {
            shuffled.append(strA.charAt(i));
            shuffled.append(strA.charAt(length - 1 - i));
        }
        if (length % 2 != 0) {
            shuffled.append(strA.charAt(length / 2));
        }
        return Integer.parseInt(shuffled.toString());
    }
}
