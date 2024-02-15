/** Write a function that, given arrays predicted and observed of floats (both of length N), returns the
 * Root−Mean−Square-Error of these values. For every J, the value predicted[J] corresponds to observed[J].
 * The result will be accepted if its absolute error is at most 10^4.
 * */
public class dataScienceRootMeanSquareError {
    public static void main(String[] args){
        float[] predicted = {4, 25, 0.75f, 11};
        float[] observed = {3, 21, -1.25f, 13};
        System.out.println(solution(observed, predicted));
    }

    public static float solution(float[] observed, float[] predicted){
        float sum =0;
        for(int i=0; i<predicted.length; i++){
            sum += Math.pow(predicted[i] - observed[i], 2);
        }
        float rmse = (float) Math.sqrt(sum / predicted.length);
        return rmse;
    }
}
