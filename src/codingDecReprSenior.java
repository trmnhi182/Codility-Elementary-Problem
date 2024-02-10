import java.util.HashSet;

/**Two non-negative integers are called siblings if they can be obtained from each other by rearranging the digits
 * of their decimal representations. For example, 123 and 213 are siblings. 535 and 355 are also siblings.
 * A set consisting of a non-negative integer N and all of its siblings is called the family of N. For example,
 * the family of 553 comprises three numbers: 355, 535 and 553.
 * Write a function that, given a non-negative integer N, returns the largest number in the family of N.
 * For example, given N = 213 the function should return 321. Given N = 553 the function should return 553.
 * Assume that:N is an integer within the range [0..10,000].*/
public class codingDecReprSenior {
    public static void main(String[] args){
        System.out.println(solution(1802));
        System.out.println(solution(64));
        System.out.println(solution(000));
        System.out.println(solution(1112));
    }

    public static int solution(int number){
        HashSet<Integer> family = new HashSet<>();
        String stringValue = String.valueOf(number);
        int max = number;

        for(int i =0; i<stringValue.length(); i++){
            for(int j = i+1; j<stringValue.length(); j++){
                String siblingStr = stringValue.substring(0, i) + stringValue.substring(j, j + 1) + stringValue.substring(i + 1, j) + stringValue.substring(i, i + 1) + stringValue.substring(j + 1);
                int sibling = Integer.parseInt(siblingStr);
                family.add(sibling);
            }
        }

        for(int num: family){
            if(num > max) max = num;
        }
        return max;
    }
}
