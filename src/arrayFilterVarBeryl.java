// Write a function that, given an array A consisting of N integers, returns the sum of all
// integers which are multiples of 4.
public class arrayFilterVarBeryl {
    public static void main(String[] args){
        int[] a ={18,2,6,4,2000,2001};
        System.out.println(solution(a));
    }

    public static int solution (int[] array){
        int sum =0;
        for(int i : array){
            if(i%4==0){
                sum+=i;
            }
        }
        return sum;
    }
}
