
/**
 * Write a description of class ex5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class ex5{
   public static boolean[]sieve(int n){
      boolean[] result = new boolean[n];
      for (int i=2;i<n;i++){
         result[i] = true;
      }
      for (int number=2;number<=(int)Math.sqrt(n);number++){
         if (result[number] == true){
            for (int indexInSeries = number*number;indexInSeries < n;indexInSeries += number){
               result[indexInSeries] = false;
               System.out.print(indexInSeries);
            }
         }
      }
      return result;
   }
   public static void main(String[] args){
   int[]result={2,3,4,5,6,7,8,9,10};
   //System.out.print(Arrays.toString(sieve(result,2)));;
   }
}
