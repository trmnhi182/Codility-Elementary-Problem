/**You are given an array A of N integers. You can multiply any of its elements by an arbitrary
 * number. The task is to make the first element of A positive, the second element equal to 0,
 * the third element negative, the fourth equal to 0, the fifth positive and so on. In other words,
 * the signs of consecutive elements should be [+, 0, −, 0, +, 0, −, ...].
 * What is the minimum number of multiplications needed to create such a sequence? Write a function that,
 * given an array A, returns the minimum number of multiplications needed to create the described sequence,
 * or −1 if it is not possible.
 * */
public class alternatingSigns {
    public static void main(String[] args){
        int[] a={0,0,0,0};
        int[] b={1, 0, 3, 4, 5, 0, 6};
        int[] c={7, 4, -3, 0, -5, 1, 0};
        int[] d={-5, 0, 3, 0};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));
    }
    public static int solution(int[] array){
        boolean isPositive = true;
        int count =0;
        for(int i=0; i<array.length; i++){
            if(i%2==0){
                if(isPositive){
                    isPositive = false;
                    if(array[i] == 0){
                        count = -1;
                        break;
                    }
                    if(array[i] < 0) count ++;
                }else{
                    isPositive = true;
                    if(array[i] == 0){
                        count = -1;
                        break;
                    }
                    if(array[i] > 0) count ++;
                }
            }else{
                if(array[i]<0 || array[i]>0) count ++;
            }
        }
        return count;
    }
}
