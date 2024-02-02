public class findMin {
    public static void main(String[] args){
        long[] a={1,2,3,42,1,-10};
        long[] b={0,0,0,0};
        long[] c={-2147483648,999999,123456789};
        long[] d={-1,-2,-3,-10,-18,-20};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));
    }

    public static long solution(long[] array){
        long min =array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<min) min = array[i];
        }
        return min;
    }
}
