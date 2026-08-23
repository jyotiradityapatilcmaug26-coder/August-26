import java.util.Scanner;

public class SumOfOddN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        int oddSum = 0;

        for (int value = 1; value <= limit; value++) {

            if (value % 2 != 0) {
                oddSum += value;
            }
        }

        System.out.println(
                "Sum of odd numbers from 1 to " + limit + " = " + oddSum
        );

        input.close();
    }
}
