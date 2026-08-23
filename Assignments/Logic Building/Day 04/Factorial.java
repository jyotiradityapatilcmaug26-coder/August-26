import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int factorial = 1;

        for (int value = 1; value <= number; value++) {
            factorial = factorial * value;
        }

        System.out.println("Factorial of " + number + " = " + factorial);

        input.close();
    }
}
