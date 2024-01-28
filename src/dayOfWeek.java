import java.util.List;

/**Days of the week are represented as three-letter strings ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").
 * Write a function solution that, given a string S representing the day of the week and an integer K (between
 * 0 and 500, inclusive), returns the day of the week that is K days later.
 *
 * For example, given S = "Wed" and K = 2, the function should return "Fri".
 * Given S = "Sat" and K = 23, the function should return "Mon".*/
public class dayOfWeek {
    public static void main(String[] args){
        System.out.println(Solution("Mon",18));
        System.out.println(Solution("Wed",0));
        System.out.println(Solution("Thu",500));
    }

    public static String Solution(String day, int daysLater){
        List<String> days = List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        int index = days.indexOf(day);
        return days.get((index + daysLater) % 7);
    }

}
