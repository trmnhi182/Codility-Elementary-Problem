/**Myung has a fancy application on her mobile, which shows her the time not in hours, minutes and seconds
 * but only in seconds. She is in a bit of a hurry and she needs your help to convert the output of this application
 * into a readable format. Write a function: that, given a time T in seconds, converts it into a string in the format
 * " <<hours>>h<<minutes>>m<<seconds>>s".
 *
 * For example, given T=7500 the function should return 2h5m0s. Given T=83643 the function should return 23h14m3s.
 *
 * Assume that: T is an integer within the range [0..86,399].*/
public class timeInSeconds {
    public static void main(String[] args){
        System.out.println(solution(1802));
        System.out.println(solution(-1802));
        System.out.println(solution(18020604));

    }
    public static String solution(int seconds){
        if(seconds<0) return "Invalid Data";
        int minutes = seconds/60;
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int remainingSeconds = seconds%60;

        return hours+"h"+remainingMinutes+"m"+remainingSeconds+"s";
    }
}
