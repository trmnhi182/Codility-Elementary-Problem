public class CaptchaMultiplication {
    public static void main(String[] args){
       solution(18,"two");
        solution(6,"four");
        solution(200,"zero");

    }
    public static void solution(int number, String num){
        int stringToNum = switch(num){
            case "one" -> 1;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            default -> -1;

        };

        var result = (stringToNum<0)?"Invalid": (number * stringToNum);
        System.out.println(result);
    }
}
