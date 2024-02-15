/**
 * There is a street described by a string S. Each character in S is one of the following:
 * "<" denotes a car going to the left,
 * ">" denotes a car going to the right,
 * "." denotes a speed camera.
 * Count the total number of times that cars pass by a speed camera. A car going to the left will pass every speed
 * camera that is to the left of it, and similarly, a car going to the right will pass every speed camera to the right
 * of it.
 * Write a function that, given a string S of length N, returns the total number of times that cars pass by a speed camera.
 * Examples:
 * 1. Given S = ".>...", the function should return 3. The car will pass by three speed cameras to the right of it.
 * 2. Given S = ".>.<.>", the function should return 4. The first two cars will pass by two speed cameras each, and the third car will not pass by any.
 * 3. Given S = ">>>.<<<", the function should return 6. Each car will pass one speed camera.
 */
public class speedMeasurementPoint {
    public static void main(String[] args){
        System.out.println(solution(".>..."));
        System.out.println(solution(".>.<.>"));
        System.out.println(solution(">>>.<<<"));
    }
    public static int solution(String s) {
        int res = 0;
        for (int i = 0, cnt = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '.') cnt++;
            else if (s.charAt(i) == '<') res += cnt;
        }

        for (int i = s.length() - 1, cnt = 0; i >= 0; --i) {
            if (s.charAt(i) == '.') cnt++;
            else if (s.charAt(i) == '>') res += cnt;
        }
        return res;
    }
}

