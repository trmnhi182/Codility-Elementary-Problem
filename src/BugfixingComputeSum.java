/**Find the bug(s) and modify one line of code in the incorrect implementation of a function solution that is
 * supposed to return the sum of all elements in the given array A which contains at most 1000 integers within
 * range [-1000..1000].*/
public class BugfixingComputeSum {
    public static void main(String[] args){
        int[] a = {18,02,06,04};
        System.out.println(Solution(a));
    }
    public static int Solution(int[] array){
        int result =0;
        for(int i=0; i<array.length; i++){
            result+=array[i];
        }
        return result;
    }
}
