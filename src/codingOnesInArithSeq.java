/**
 * Write a function that, given an integer N, returns the number of times the digit 1 occurs in decimal representations
 * of all positive integers not exceeding N.
 For example, given N = 13 the function should return 6, because: all the positive integers that do not exceed 13 are
 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 and 13; digit 1 occurs six times altogether: once in number 1, once in number 10,
 twice in number 11, once in number 12 and once in number 13.
 */
public class codingOnesInArithSeq {
    public static void main(String[] args){
        System.out.println(solution(182));
        System.out.println(solution(13));
        System.out.println(solution(1));
    }

    public static int solution(int number){
        int count =0;
        for(int i=0; i<=number; i++){
            String stringValue = String.valueOf(i);
            count += stringValue.split("1", -1) . length - 1;
        }
        return count;
    }
}
