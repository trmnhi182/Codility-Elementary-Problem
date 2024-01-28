/**Write a function solution that, given a string S of length N, replaces all occurrences of "plus" with "+"
 * and all occurrences of "minus" with "-".
 Examples:
 1. Given S = "minusplusminus", the function should return "-+-".
 2. Given S = "plusminusminusplus", the function should return "+--+". Assume that:
 N is an integer within the range [4..1,000];
 S is created by concatenating only strings "plus" and "minus".
 */

public class plusMinusConversion {
    public static void main(String[] args){
        String a = "Man Nhi";
        String b = "minusplusminus";
        String c = " ";
        String d = "--00";
        String e = "PlusMinusPlusPlus";
        String f = "plusminusminusplus";
        System.out.println(Solution(a));
        System.out.println(Solution(b));
        System.out.println(Solution(c));
        System.out.println(Solution(d));
        System.out.println(Solution(e));
        System.out.println(Solution(f));
    }
    public static String Solution(String s){
        StringBuilder result = new StringBuilder();
        int i = 0;

        if (s == null || s.isEmpty()) {
            return s;
        }
        while (i < s.length()) {
            if (s.startsWith("plus", i)) {
                result.append('+');
                i += 4;
            } else if (s.startsWith("minus", i)) {
                result.append('-');
                i += 5;
            } else {
                return "Invalid";

            }
        }
        return result.toString();
    }
}