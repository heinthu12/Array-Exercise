
/**
 * クラス Exercise1 の注釈をここに書きます.
 * 
 * @Hein Thu (あなたの名前)
 * @chapter8 Think Java (バージョン番号もしくは日付)
 */
import java.util.Arrays;
public class exercise1{
  public static double[] powArray(double[] array, double power){
      double[] a = new double[array.length];
      for (int i=0;i<array.length;i++){
         a[i] = Math.pow(array[i],power);
      }
      return a;
  }
  public static int[] histogram(int[] array,int counts){
      int[] counter = new int[counts];
      for (int element:array){
         counter[element]++;
      }
      return counter;
  }
  public static void main(String[]args){
    double[]a = {1,2,3};
    int[]counter = {1,1,1,1,2};
    System.out.print(Arrays.toString(powArray(a,2)));
    System.out.print(Arrays.toString(histogram(counter,3)));
   } 
}