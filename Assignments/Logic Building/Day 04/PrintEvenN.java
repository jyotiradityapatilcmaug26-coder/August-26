import java.util.Scanner;

public class PrintEvenN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        System.out.println("Even numbers are:");

        for (int value = 1; value <= limit; value++) {

            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }

        input.close();
    }
}
