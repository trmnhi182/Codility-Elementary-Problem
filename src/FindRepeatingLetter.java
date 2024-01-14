// You are given a string S, in which one letter occurs twice. Every other letter occurs at most once
// returns a single-character string: the letter that occurs twice.

import java.util.HashMap;

public class FindRepeatingLetter {

    public static void main(String[] args){
        System.out.println(findRepeatingLetter("Anything"));
        System.out.println(findRepeatingLetter("aabbcc"));
        System.out.println(findRepeatingLetter("AABBCC"));
        System.out.println(findRepeatingLetter("b"));
        System.out.println(findRepeatingLetter("000"));
    }

    public static char findRepeatingLetter(String string){
        char repeatedLetter = ' ';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i<string.length(); i++){
            if (string.matches(".*[a-z].*")) {
                if(map.containsKey(string.charAt(i))) {
                    repeatedLetter=string.charAt(i);
                    break;
                }
                map.put(string.charAt(i),i);
            }
        }
        return repeatedLetter;
    }
}
