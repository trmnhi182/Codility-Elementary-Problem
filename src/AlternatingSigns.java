/**The task is to make the first element of A positive, the second element equal to 0, the third element negative,
 * the fourth equal to 0, the fifth positive and so on. In other words, the signs of consecutive elements should be
 * [+, 0, −, 0, +, 0, −, ...].
 *
 * Find what is the minimum number of multiplications needed to create such a sequence?
 *
 * Not done yet*/
public class AlternatingSigns {

    public static void main(String[] args){
        int a[] = {1,8,2,6,4,2,1};
        int b[] = {0,6,0,4,2,0,0,0};
        int c[] = {1, 0, 3, 4, 5, 0, 6};
//        int d[] = {7, 4, −3, 0, −5, 1, 0};

        System.out.println(Solution(a));
        System.out.println(Solution(b));
        System.out.println(Solution(c));
    }

    public static int Solution(int[] array){
        int count = 0;

        boolean isPositive = true;
        for(int i =0; i<array.length-1; i++){
            if(i%2==0){
                if(isPositive){
                    if(array[i]<0){
                        count++;
                        isPositive = false;
                    }else if(array[i] > 0){
                        continue;
                    }else{
                        count =-1;
                        break;
                    }
                }else{
                    if(!isPositive){
                        if(array[i]>0){
                            count++;
                            isPositive=true;
                        }else if(array[i]<0){
                            continue;
                        }else{
                            count = -1;
                            break;
                        }
                    }
                }
            }else if(i%2 != 0){
                if(array[i] != 0){
                    count++;
                }else{
                    continue;
                }
            }
        }
        return count;
    }
}
