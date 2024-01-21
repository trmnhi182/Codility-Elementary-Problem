/**Write a function that, given a string text, returns the string encrypted using a Caesar cipher with a
 * rotation of 4.
 * Examples:
 * 1. Given text = "PINEAPPLE", the function should return "TMRIETTPI".
 * 2. Given text = "ZEBRA", the function should return "DIFVE".
 * 3. Given text = "NETWORK", the function should return "RIXASVO".
 *
 * Reference for formula: https://vi.wikipedia.org/wiki/M%E1%BA%ADt_m%C3%A3_Caesar*/
public class CaesarCipher4 {
    public static void main(String[] args){
        String a = "MAN NHI";
        String b = "Bao Khoi";

        System.out.println(Solution(a));
        System.out.println(Solution(b));


    }
    public static StringBuffer Solution(String string){
        StringBuffer result= new StringBuffer();
        for(int i=0; i<string.length(); i++){
           if(Character.isUpperCase(string.charAt(i))){
               // 4 -> rotation of 4
               char ch = (char)(((int)string.charAt(i) + 4 - 65) % 26 + 65);
               result.append(ch);
           }else{
               char ch = (char)(((int)string.charAt(i) + 4 - 97) % 26 + 97);
               result.append(ch);
           }
        }
        return result;
    }
}
