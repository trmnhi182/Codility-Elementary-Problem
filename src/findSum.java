/**Write a function that, given an array A of N integers, returns the sum of values from array A:
 * sum{ A[i] : 1 ≤ i ≤ N }
 * For example, given:
 * A[0] = 1
 * A[1] = 2
 * A[2] = 3
 * A[3] = 42
 * A[4] = 1
 * A[5] = -7
 * your function should return 42.
 * */
public class findSum {
    public static void main(String[] args){
        int[] a ={18,2,-6,-4};
        int[] b ={0,0,0,0,0};
        int[] c = {};
        int[] d = {-1,-1,-1,-1};
        System.out.println(Solution(a));
        System.out.println(Solution(b));
        System.out.println(Solution(c));
        System.out.println(Solution(d));
    }

    public static int Solution(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
}
