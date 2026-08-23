import java.util.Scanner;

public class PositiveNegativeElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[5];
        int positiveCount = 0;
        int negativeCount = 0;

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

        for (int value : values) {

            if (value > 0) {
                positiveCount++;
            }
            else if (value < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive elements: " + positiveCount);
        System.out.println("Negative elements: " + negativeCount);

        input.close();
    }
}
