/**Write a function solution that returns a string of length N consisting of alternating characters: "+" and "-",
 * starting with a "+" character. You can assume N is between 1 and 100.
 For example, given N = 5, your function should return "+-+-+" and given N = 4, it should return "+-+-".
 */
public class stringRepeat {
    public static void main(String[] args){
        System.out.println(Solution(18));
    }

    public static StringBuffer Solution(int number){
        StringBuffer string = new StringBuffer();
        for(int i=0; i<number; i++){
            string = (i%2==0)? string.append("+"):string.append("-");
        }
        return string;
    }
}
