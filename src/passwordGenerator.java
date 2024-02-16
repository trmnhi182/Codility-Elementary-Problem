import java.util.Random;

/**Write a function that returns a password whose length is passed as a parameter.
 *
 * Requirements:
 * The generated password must be at least 3 characters long. Password must comply with at least three of the
 * following four character categories:
 *      Contain at least one uppercase character (A-Z).
 *      Contain at least one lowercase character (a-z).
 *      Contain at least one digit (0-9).
 *      Contain at least one symbol (~!@#$%^&*_-+=`|(){}[]:;"'<>,.?/).
 *
 * Hints
 * The name of the method to perform the task is already provided with the correct definition of name and parameters
 *      (passwordGenerator(charsQuantity)).
 * The charsQuantity parameter must always be a number.
 * RegExp can be used.
 *
 * Examples
 * Case 1: Input is not an integer. For input: passwordGenerator(null) or
 * passwordGenerator(undefined) or
 * passwordGenerator({}) or
 * passwordGenerator([]) or
 * passwordGenerator('') or
 * passwordGenerator(' ') or
 * passwordGenerator('abc') or
 * passwordGenerator('16.1') or
 * passwordGenerator(16.1)
 * Expected Output: 'Not an Integer'
 *
 * Case 2: Input is less than 3. For Input: passwordGenerator(2) Expected Output: 'Minimum length allowed: 3'
 *
 * Case 3: Output is a string with desired length and complies with at least three of the four character categories.
 * For Input: passwordGenerator(16) Expected Output: 8t=(eUz1/G*N;?v_ (Password as example)*/
public class passwordGenerator {
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static  String SYMBOL ="~!@#$%^&*_-+=`|(){}[]:;\"'<>,.?/";


    public static void main(String[] args){
        System.out.println(solution("18"));
        System.out.println(solution("0"));
        System.out.println(solution("nnn"));
    }

    public static String solution(String charsQuantity){
        int intValue = Integer.parseInt(charsQuantity);

        //Case 1
        try {
            Integer.parseInt(charsQuantity);
        } catch (NumberFormatException e) {
            return "Not an Integer";
        }

        //Case 2: Input is less than 3. For Input: passwordGenerator(2) Expected Output: 'Minimum length allowed: 3'
        if(intValue <3) return "Minimum length allowed: 3";

        //Case 3:
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(UPPERCASE_CHARS.charAt(random.nextInt(UPPERCASE_CHARS.length())));
        password.append(LOWERCASE_CHARS.charAt(random.nextInt(UPPERCASE_CHARS.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SYMBOL.charAt(random.nextInt(SYMBOL.length())));

        String allChars = UPPERCASE_CHARS + LOWERCASE_CHARS + DIGITS + SYMBOL;
        for (int i = 3; i < intValue; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle the password to ensure randomness
        for (int i = password.length() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }

        return password.toString();
    }
}
