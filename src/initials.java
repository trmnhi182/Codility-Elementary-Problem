/**Write a function solution that, given strings name and surname and integer age, returns a string composed
 * of the first two letters from each of name and surname followed by age. For example, given name = "John",
 * surname = "Firelord" and age = 8, your function should return "JoFi8".
 * You can assume the length of name and surname is between 2 and 20, and age is between 1 and 200.
 */

public class initials {
    public static void main(String[] args){
        System.out.println(Solution("Man","Nhi",18));
    }

    public static String Solution(String name, String surname, int age){
        String stringAge = Integer.toString(age);
        return name.substring(0,2)+surname.substring(0,2)+stringAge;
    }
}
