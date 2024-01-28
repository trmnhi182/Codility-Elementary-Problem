/**We consider a string which is created by repeating the string "+--". Write a function solution that,
 * given an integer N, returns the first N characters of this string. You can assume N is between 1 and 200.
 Examples:
 1. Given N = 5, the function should return "+--+-".
 2. Given N = 7, the function should return "+--+--+".
 */
public class plusMinusMinus {
    public static void main(String[] args){
        int a = 18;
        int b =0;
        int c = -1;
        int d = 6;

        System.out.println(Solution(a));
        System.out.println(Solution(d));
        System.out.println(Solution(b));
        System.out.println(Solution(c));
    }
    public static StringBuffer Solution(int number){
        StringBuffer newString = new StringBuffer();
        for(int i = 0; i<number; i++){
            if(i%3==0){
                newString.append("+");
            }else{
                newString.append("-");
            }
        }
        return newString;
    }
}
