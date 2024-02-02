/**Write a function that, given a non-empty array A of N integers, returns the maximum value
 * from array A: max{ A[i] : 0 ≤ i < N }
 *  For example, given:
 *  A[0] = 1     A[1] = 2    A[2] = 3
 *  A[3] = 42    A[4] = 1    A[5] = -10
 *  your function should return 42.
 */
public class findMax {
    public static void main(String[] args){
        long[] a={1,2,3,42,1,-10};
        long[] b={0,0,0,0};
        long[] c={-2147483648,999999,123456789};
        long[] d={-1,-2,-3,-10,-18,-20};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));
    }

    public static long solution(long[] array){
        long max =array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max) max = array[i];
        }
        return max;
    }
}
