
/**
 * クラス Warmup1 の注釈をここに書きます.
 * 
 * @author (Pan zun)
 * @version (2019/09/06  )
 */
public class Warmup1
{
   public static void main(String[]args){
       String[] countries = {"Japan","Canada","Maxico","Bangaladish"};
       printArray(countries);
   }
   public static void printArray(String[]countries){
      for(String country : countries ){
        System.out.println(country+" ");
      }
   }
}
