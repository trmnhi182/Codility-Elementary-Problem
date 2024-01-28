/**Write a function that, given a string S consisting of N characters, returns the reversal of S.
 * For example, given S = "abcdefg" the function should return "gfedcba".*/
public class stringReverse {
    public static void main(String[] args){
        System.out.println(Solution("Man Nhi"));
        System.out.println(Solution("0123"));
        System.out.println(Solution("K"));
    }

    public static String Solution(String s){
        char character;
        String newString = "";

        for(int i=0; i<s.length(); i++){
            character=s.charAt(i);
            newString= character+newString;
        }

        return newString;
    }
}
