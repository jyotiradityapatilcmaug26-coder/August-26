import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print its table: ");
        int tableNumber = input.nextInt();

        printMultiplicationTable(tableNumber);

        input.close();
    }

    public static void printMultiplicationTable(int tableNumber) {

        System.out.println("\nMultiplication Table of " + tableNumber);

        for (int count = 1; count <= 10; count++) {
            System.out.println(tableNumber + " x " + count + " = "
                    + (tableNumber * count));
        }
    }
}
