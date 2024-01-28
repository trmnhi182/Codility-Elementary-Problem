/**Write a function that prints out ASCII-art in the shape of the capital letter L, made up of copies of the
 * capital letter L. Parameter N is an integer (between 1 and 100) and represents the expected size of the
 * ASCII-art (the output should comprise N rows, the last of which should comprise N letters L).
 * For example, here is the output for N = 4:
 L
 L
 LLLLL
 The function should not return any value.*/
public class asciiArtL {
    public static void main(String[] args){

        Solution(0);
    }

    public static void Solution(int n){
        int i=1;
        while(i<n){
            System.out.println("L");
            i++;
        }
        for(int j=0; j<n; j++){
            System.out.print("L");
        }
        if(n<=0){
            System.out.println(-1);
        }
    }
}
