// Find how many distinct values can be obtained by the absolute difference consecutive elements
import java.util.HashSet;
import java.util.Set;

public class ConsecutiveElementsDifferences {
    public static void main(String[] args) {
        int[] array = {18,2,6,4};
        int n = array.length;
        
        System.out.println(Solution(array));
    }

    public static int Solution(int[] array) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0 ; i < array.length; i++)
            s.add(Math.abs(array[i]));
        return s.size();
    }

}