/**Write a function that returns the second largest of the values of A, B and C.*/
public class median3 {

    public static void main(String[] args){
        System.out.println(solution(18,2,64));
        System.out.println(solution(182,6,4));
        System.out.println(solution(0,0,0));

    }
    public static int solution(int a, int b, int c){
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        if(a != max && a !=min) {
            return a;
        }else if(b != max && b !=min){
            return b;
        }else{
            return c;
        }
    }
}
