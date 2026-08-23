import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        askForPositiveNumber();
    }

    public static void askForPositiveNumber() {

        Scanner input = new Scanner(System.in);
        int value;

        do {
            System.out.print("Please enter a positive number: ");
            value = input.nextInt();

            if (value <= 0) {
                System.out.println("Invalid input! Try again.");
            }

        } while (value <= 0);

        System.out.println("Accepted positive number: " + value);

        input.close();
    }
}
