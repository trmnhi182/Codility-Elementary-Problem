/**You are given a string representing a sequence of N arrows, each pointing in one of the four cardinal
 * directions: up ('^'), down ('v'), left ('<') or right ('>').
 Write a function solution that, given a string S denoting the directions of the arrows, returns the minimum number
 of arrows that must be rotated to make them all point in the same direction.
 */
public class arrows {
    public static void main(String[] args){
        String a = "^vv<v";
        String b = "^^^^";
        String c = "v>>>vv";
//        String d = "asdf";
        System.out.println( Solution(a));
        System.out.println( Solution(b));
        System.out.println( Solution(c));
//        System.out.println( Solution(d));
    }

    public static int Solution(String string){
        int up=0 , down=0, left=0, right=0;

        for(int i=0; i<string.length(); i++){
            switch(string.charAt(i)){
                case 'v' -> down++;
                case '^' -> up++;
                case '>' -> right++;
                case '<' -> left++;
            };
        }

        int a[] = {up,down,left,right};
        int max = a[0];
        for(int i =0; i<a.length; i++){
            if (a[i]>max){max = a[i];}
        }
        int result = string.length()-max;
        return result;
    }
}
