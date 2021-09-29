import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integer for the first triangle side: ");
            int firstTriangleSide = scanner.nextInt();
            System.out.println("Enter integer for the second triangle side: ");
            int secondTriangleSide = scanner.nextInt();
            System.out.println("Enter integer for the third triangle side: ");
            int thirdTriangleSide = scanner.nextInt();
            String output = new Triangle(firstTriangleSide, secondTriangleSide, thirdTriangleSide).triangleType();
            System.out.println(output);
        } catch (InputMismatchException e) {
            System.out.println("You entered not an integer number! Please enter integer numbers in range from 1 to MaxInteger " + Integer.MAX_VALUE);
        }
    }
}
