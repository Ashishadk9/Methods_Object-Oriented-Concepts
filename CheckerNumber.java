
/**
 * Write a description of class CheckerNumber here.
 
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckerNumber
{
    public static void checkNumber(int number){
     if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if 
        (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println(number + " is Zero.");
        }
  }
     public static void checkNumber(int number, boolean checkEvenOdd) {
         if(checkEvenOdd){
             if(number%2== 0){
                  System.out.println(number + " is Even.");
            } else {
                System.out.println(number + " is Odd.");
            }
        }
     }
      public static void main(String[] args){
          int Number=5;
          checkNumber(Number);
          checkNumber(Number, true);
      }
}
     
