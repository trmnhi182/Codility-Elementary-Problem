/**You are given a non-empty string S consisting of N characters. In this problem we consider only strings that
 * consist of lower-case English letters (a−z) and spaces. S can be divided into words by splitting it at the spaces
 * and removing them. We want to reverse every word in S.
 *
 * For example, given S = "we test coders", there are three words: "we", "test" and "coders". Reversing the words gives
 * "ew", "tset" and "sredoc".
 * The goal is to return a string with every word in string S reversed and separated by spaces, so the result in the above
 * example should be "ew tset sredoc". You can assume that if there are K spaces in S then there are exactly K + 1 words.
 * Write a function that, given a non-empty string S consisting of N characters, returns the reversal of every word of S.
 * For example, given S = "we test coders", the function should return "ew tset sredoc", as explained above.
 */
public class codingWordsRev {
    public static void main(String[] args){
        System.out.println(solution("Bao Khoi"));
        System.out.println(solution("Man Nhi"));
        System.out.println(solution("BK"));
    }
    public static String solution(String s){
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            reversed.append(new StringBuilder(word).reverse().toString());

            if (i < words.length - 1) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
