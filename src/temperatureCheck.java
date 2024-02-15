/**A change in body temperature is one of the first signs of developing disease such as cold or influenza.
 * Even in itself, too high or too low a body temperature may be really dangerous. We recognise four states of
 * body temperature:
    * hypothermia (below 35.0°C),
    * normal (at least 35.0°C and at most 37.5°C),
    * fever (above 37.5°C and at most 40.0°C),
    * hyperpyrexia (above 40.0°C).
 *
 * Given a measurement, return the patient's body temperature state. Write a function that, given a string T,
 * describing a patient's body temperature in the Celsius scale, returns the name of the patient's temperature state.
 * The string T is in the form "DD.D", where D denotes a digit.
 *
 * Examples:
 * 1. Given T = "34.5", the function should return "hypothermia".
 * 2. Given T = "35.0", the function should return "normal".
 * 3. Given T = "37.6", the function should return "fever".
 * 4. Given T = "41.0", the function should return "hyperpyrexia".
 *
 * Assume that:
 *  string T is in format "DD.D", where D denotes a digit;
 *  string T describes temperature within the range [34.0°C, 42.0°C].*/
public class temperatureCheck {
    public static void main(String[] args){
        System.out.println(solution("18.2"));
        System.out.println(solution("36"));
        System.out.println(solution("40.111111"));

    }
    public static String solution(String temperature){
        float floatValue = Float.parseFloat(temperature);
        if(floatValue <35.0){
            return "hypothermia";
        }else if(floatValue >=35.0 && floatValue <=37.5){
            return "normal";
        }else if(floatValue > 37.5 && floatValue <=40){
            return "fever";
        }else{
            return "hyperpyrexia";
        }
    }
}
