/**Complete an implementation of a function solution, that should return a string describing first character
 * of the given string: "digit" for a digit, "lower" for a lowercase letter, "upper" for an uppercase letter and
 * "other" for other characters. You can assume the characters are ASCII.*/
public class charClassification {
    public static void main(String[] args){
        System.out.println(Solution("123"));
        System.out.println(Solution("abc"));
        System.out.println(Solution("ABC"));
        System.out.println(Solution("!@#"));
    }

    public static String Solution(String str){
        char firstChar = str.charAt(0);

        if (Character.isDigit(firstChar)) {
            return "digit";
        } else if (Character.isLowerCase(firstChar)) {
            return "lower";
        } else if (Character.isUpperCase(firstChar)) {
            return "upper";
        } else {
            return "other";
        }
    }
}
