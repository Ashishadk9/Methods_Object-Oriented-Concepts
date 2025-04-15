
/**
 * Write a description of class Static here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class MathUtils {

    static int multiple(int a, int b) {
        return a * b;
    }
}

public class Static {
    public static void main(String[] args) {
        int sum = MathUtils.multiple(7, 10); 
        System.out.println(sum); 
    }
}