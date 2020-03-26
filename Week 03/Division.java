/**
 * Addition
 */
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        int number1;
        int number2;
        //int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.printf("Sum is %d%n", number1/number2);
        input.close();
    }
    
}