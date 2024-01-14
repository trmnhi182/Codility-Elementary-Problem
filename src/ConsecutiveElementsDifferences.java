// Find how many distinct values can be obtained by the absolute difference consecutive elements

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveElementsDifferences {
    public static void main(String[] args) {
        int[] array = {18,2,6,4};
        int n = array.length;
        
        System.out.println(Solution(array,n));
    }

    public static int Solution(int[] array, int N) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0 ; i < N; i++)
            s.add(Math.abs(array[i]));
        return s.size();
    }

}