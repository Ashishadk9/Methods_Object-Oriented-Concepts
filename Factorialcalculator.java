
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorialcalculator
{
  public static void displayFactorial(int number) {
        if (number<0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long factorial = 1;
        for (int i=1; i<= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of "+ number +" is = " + factorial);
    }
}