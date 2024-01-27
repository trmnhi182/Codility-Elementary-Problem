import java.util.HashSet;

/**Write a function that, given an array A of N integers, returns a string S as follows:
 * S[J] is set to '<' ifA[J] < 0;
 * S[J] is set to '>' ifA[J] > 0;
 * S[J] is set to '=' ifA[J] = 0.
 S should not contain any characters other than '<', '>' and '='.
 For example, given A = [1, 2, 0, −3] your function should return ">>=<".*/
public class cmpZero {
    public static void main(String[] args){
        int a[] = {18,-2,6,-4,0};
        int b[] = {18,6,0,0};
        int c[] = {};
        System.out.println(Solution(a));
        System.out.println(Solution(b));
        System.out.println(Solution(c));
    }

    public static StringBuffer Solution(int[] array){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<array.length; i++){
            if(array[i] < 0){
                sb.append("<");
            }else if(array[i] > 0){
                sb.append(">");
            }else{
                sb.append("=");
            }
        }
        return sb;
    }
}
