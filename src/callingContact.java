/**During an incoming call, phones usually display on the screen the number of the caller.
 * If the number was previously saved in the contacts, the phone displays the name of the caller
 * from the contact list instead. Your task is to write a function which determines what should be
 * displayed on the phone screen during an incoming call.
 *
 * Write a function that, given the contact list in the form of two arrays,
 * phone_numbers and phone_owners, consisting of N strings each, and a string number denoting the
 * caller's number, returns the name of corresponding contact, or just number if the number is not
 * present in the contact list. phone_numbers[J] contains the phone number of the person from
 * phone_owners[J], where J is within the range [0..N−1].
 */

public class callingContact {
    public static void main(String[] args){
        String[] a1 ={"234−567−890", "444−444−444", "321−543−234"};
        String[] a2={"Harry", "Nick", "Michael"};
        String a3="444−444−444";

        String[] b1 ={"123−123−123"};
        String[] b2={"Walter"};
        String b3="111−111−111";

        String[] c1 ={"111−111−112", "211−111−111"};
        String[] c2={"laundry", "call center"};
        String c3="111−111−111";

        String[] d1 ={"123−456−123"};
        String[] d2={"Henry T."};
        String d3="123−456−123";

        System.out.println(solution(a1,a2,a3));
        System.out.println(solution(b1,b2,b3));
        System.out.println(solution(c1,c2,c3));
        System.out.println(solution(d1,d2,d3));

    }

    public static String solution(String[] phoneNumbers, String[] phoneOwners, String number){
        for (int i = 0; i < phoneNumbers.length; i++) {
            if (phoneNumbers[i].equals(number)) {
                return phoneOwners[i];
            }
        }
        return number;
    }
}
