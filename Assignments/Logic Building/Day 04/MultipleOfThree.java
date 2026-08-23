import java.util.Scanner;

public class MultipleOfThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        System.out.println("Multiples of 3:");

        for (int value = 1; value <= limit; value++) {

            if (value % 3 == 0) {
                System.out.print(value + " ");
            }
        }

        input.close();
    }
}
