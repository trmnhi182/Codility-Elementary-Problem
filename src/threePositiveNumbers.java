/**Write a function solution that, given an array A of N integers, returns the sum of the first three positive
 * integers in that array (counting from the left). If there are fewer than three positive numbers then sum
 * all of the positive numbers that are present.
 *
 * Examples:
 1. Given A = [4, -2, 0, 5, -2, 1, 6], the function should return 10 (the first three positive integers are 4, 5, 1).
 2. Given A = [3, -2, 0], the function should return 3. There is only one positive number (3), so only that number
 is the component of the result.
 3. Given A = [-9, -4, -2, -6], the function should return 0. None of the numbers is positive.*/
public class threePositiveNumbers {
    public static void main(String[] args){
        int[] a ={18,-2,-4,0};
        int[] b ={18,2,6,0,4};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static int solution(int[] array){
        int sum = 0;
        int count = 0;

        for(int i=0; i<array.length;i++){
            if(array[i]>0){
                sum+=array[i];
                count++;
            }
            if(count==3) break;
        }
        return sum;
    }

}
