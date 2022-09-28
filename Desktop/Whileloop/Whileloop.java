
/**
 * Write a description of class Whileloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Whileloop
{

    int i = 16;
    int k = 6;
    int a = 21;
    int b = 28;

    public void run() {
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
        }
        while (k > 5) {
            System.out.println("k is " + k + " but is more than 5");
        }
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " but is less than 10");
            System.out.println("b is " + b + " but is less than or equal to 20");
        }
    }
}