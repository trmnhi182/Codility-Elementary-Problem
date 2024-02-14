import java.util.ArrayList;
import java.util.Collections;

/**When you open the dialer of your phone and start typing a number, you will probably get search results
 * from the saved contacts for the number you entered. Your task is to implement a similar feature.
 *
 * Saved contacts are numbered from 0 to N-1. They are represented by two arrays A, B of N strings each.
 * Name of K-th contact is A[K] and phone number is B[K].
 *
 * Write a function which, given two arrays A and B and a string P of length M representing a partial phone number,
 * returns the contact name whose phone number contains P as a substring, that is a contiguous segment
 * (for example, "436800143" contains as a substring "6800", but not "3614").
 *          If there is more than one contact matching the search criteria, your function should return the alphabetically
 * smallest contact name.
 *          If no match is found, your function should return "NO CONTACT".
 Examples:
 1. Given A = ["pim", "pom"], B = ["999999999", "777888999"] and P = "88999", your function should return "pom",
 because only pom's phone number contains "88999".
 2. Given A = ["sander", "amy", "ann", "michael"], B = ["123456789", "234567890", "789123456", "123123123"] and
 P = "1", your function should return "ann". Note that sander, ann and michael's phone numbers contain "1" but "ann"
 is alphabetically smaller than "michael" and "sander".
 3. Given A = ["adam", "eva", "leo"], B = ["121212121", "111111111", "444555666"] and P = "112", your function should
 return "NO CONTACT", because no phone number contains "112".*/
public class contactDialer {
    public static void main(String[] args){
        String[] a1 = {"John", "Alice", "Bob"};
        String[] a2 = {"123456789", "6800143", "123456789"};
        String a3 = "6800";
        System.out.println(solution(a1, a2, a3));

        String[] b1 = {"John", "Alice", "Bob"};
        String[] b2 = {"123456789", "6800143", "123456789"};
        String b3 = "111";
        System.out.println(solution(b1, b2, b3));

        String[] c1 = {};
        String[] c2 = {};
        String c3 = "1";
        System.out.println(solution(c1, c2, c3));
    }

    public static String solution(String[] contact, String[] phoneNumber, String number){
        ArrayList<int[]> matches = new ArrayList<>();
        for(int i=0; i<contact.length; i++){
            int index = phoneNumber[i].indexOf(number);
            if(index != -1) matches.add(new int[]{index, i});
        }
        if(matches.isEmpty()) return "NO CONTACT";
        Collections.sort(matches, (a, b) -> {
            int comparison = contact[a[1]].compareTo(contact[b[1]]);
            if (comparison == 0) {
                return Integer.compare(a[0], b[0]);
            }
            return comparison;
        });

        return contact[matches.get(0)[1]];
    }
}
