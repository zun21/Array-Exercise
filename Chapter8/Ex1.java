
/**
 * クラス Ex1 の注釈をここに書きます.
 * 
 * @author (Pan Zun)
 * @version (2019/09/06)
 */
import java.util.Arrays;

public class Ex1
{
    public static void main(String[]args){
     double[]a = {1,2,3}; 
     powArray(a,2);
     int []b = {1,1,1,2,2,3,3,3};
     System.out.print(Arrays.toString(histogram(b,3)));
    }
    public static double[] powArray(double[]a,double value){
        double[]aSquare = new double [a.length];
        for(int i = 0; i< a.length;i++){
            aSquare[i] = Math.pow(a[i],value);
            System.out.print(aSquare[i]+" ");
        }
        return aSquare;
    }
    public static int[] histogram(int[]a,int counter){
       int[]score = new int[counter];
       for (int i = 0 ; i < score.length; i++){
           int index = a[i];
           score[index]++;
       }
    return score;
    }
}
