/**Parvati is given an array of integers. She is asked to return the sum of all the two-digit numbers in the array.
 * Please help her to perform this task.
 * Write a function that, given an array A consisting of N integers, returns the sum of all two-digit numbers.
 * For example, given A = [1, 1000, 80, −91], the function should return −11 (as the two-digit numbers are 80 and −91).
 * Given A = [47, 1900, 1, 90, 45], the function should return 182 (as the two-digit numbers are 47, 90 and 45).
 * Given A = [−13, 1900, 1, 100, 45], the function should return 32 (as the two-digit numbers are −13 and 45).
 *
 * Assume that:
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
public class sumTwoDigitNumbers {
    public static void main(String[] args){
        int[] a ={-18,2,6,4,182,-64};
        System.out.println(solution(a));
    }
    public static int solution(int[] array){
        int sum=0;
        for(int i:array){
            if(Math.abs(i)>=10 && Math.abs(i)<=99){
                sum+=i;
            }
        }
        return sum;
    }

}
