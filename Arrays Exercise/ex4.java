
/**
 * クラス ex4 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex4{
  public static int indexOfMax(int[] numbers){
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
public static void main(String[] args){
    int[]numbers = {1,2,3,4,5};
  System.out.print(indexOfMax(numbers));  
 }  
}
