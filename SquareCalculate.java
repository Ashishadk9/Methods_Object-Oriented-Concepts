
/**
 * Write a description of class SquareCalculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareCalculate
{
    public int calculateSquare(int number) {
      return number * number;
  }
    public static void main (String [] args){
        SquareCalculate calculate = new SquareCalculate();
         int number =5;
         int square =calculate.calculateSquare(number);
         System.out.println("The square of " + number + " is " + square);
   }
}
