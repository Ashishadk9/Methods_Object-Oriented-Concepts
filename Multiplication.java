
/**
 * Write a description of class Multiplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplication
{
   public int multiply (int number1,int number2) {
       return number1 * number2;
  }
   public static void main(String[] args) {
       Multiplication multiplicationobj=new Multiplication();
        int result=multiplicationobj.multiply(4,8);
        System.out.println("The Multiplication of 4 and 8=" + result);
   }
}
