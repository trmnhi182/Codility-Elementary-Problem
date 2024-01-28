/**Write a function that, given an array A of N integers, returns the sum of the largest odd integer and the
 * largest even integer in A. If there are no odd or no even integers in A, you can assume that the largest one
 * in the corresponding group is 0 (look at examples 3 and 4 for comparison).
 *
 * Examples:
 * 1. Given A = [5, 3, 10, 6, 11], the function should return 21. The largest odd integer is 11 and the largest
 * even integer is 10, so their sum is 11 + 10 = 21.
 *
 * 2. Given A = [20, 10, 7, 5], the function should return 27. The largest odd integer is 7 and the largest even
 * integer is 20, so their sum is 7 + 20 = 27.
 *
 * 3. Given A = [7, 13, 15, 13], the function should return 15. The largest odd integer is 15. As there are no even
 * integers in the array, we assume the largest of them is 0.
 *
 * 4. Given A = [2, 6, 4, 6], the function should return 6. The largest even integer is 6. As there are no odd integers
 * in the array, we assume the largest of them is 0.*/
public class twoMaxes {
    public static void main(String[] args){
        int[] a ={18,2,6,4,20,22};
        int[] b ={18,33,2,19};
        int[] c ={0,0,0};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }

    public static int solution(int[] array){
        int largestOdd = 0, largestEven = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                if (num > largestEven) {
                    largestEven = num;
                }
            } else {
                if (num > largestOdd) {
                    largestOdd = num;
                }
            }
        }
        return largestOdd+largestEven;
    }
}
