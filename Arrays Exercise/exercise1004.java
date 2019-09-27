ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
/**
 * クラス ex4 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class exercise1004{
    //Write a method called indexOfMax
  public static int indexOfMax(int[] numbers){
      int index = 0;tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
      for (int i=1;i<numbers.lettttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttngth;i++){
         if (numbers[i] > numbers[index]){
            index = i;
         }
      }
      return index;
   }

   public static int indexOfMaxWrittenInEnhancedForLoop(int[] numbers){
      int index = 0;
      int i = 0;
      for (int number:numbers){
         if (numbers[i] > numbers[index]){
            index = i;
         }
         i++;
      }
      return index;
   }
}