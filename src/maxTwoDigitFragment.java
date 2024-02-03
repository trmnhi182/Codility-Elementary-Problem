/**
 * You are given a string consisting of digits. Find the biggest two-digit value that is a consistent
 * fragment of the given string.
 * For example, two-digit consistent fragments of "50552" are ["50", "05", "55", "52"], representing the
 * numbers [50, 5, 55, 52]. The biggest value among them is 55.
 * Write a function that, given a string S consisting of digits, returns the maximum two-digit value
 * that is a consistent fragment of S.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxTwoDigitFragment {
    public static void main(String []args) {
        System.out.println(solution("18020604"));
        System.out.println(solution("20002001"));
        System.out.println(solution("1122"));
        System.out.println(solution("12"));
        System.out.println(solution("9"));
    }

    public static int solution(String S) {
        List<Integer> fragments = new ArrayList<>();
        for (int i = 0; i < S.length() - 1; i++) {
            int fragment = Integer.parseInt(S.substring(i, i + 2));
            fragments.add(fragment);
        }
        if (fragments.isEmpty()) return -1;

        Collections.sort(fragments, Collections.reverseOrder());
        return fragments.get(0);
    }
}

