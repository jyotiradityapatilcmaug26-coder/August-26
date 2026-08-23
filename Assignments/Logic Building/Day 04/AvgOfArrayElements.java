import java.util.Scanner;

public class AvgOfArrayElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[5];
        int total = 0;

        System.out.println("Enter 5 numbers:");

        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

        for (int value : values) {
            total += value;
        }

        double average = total / 5.0;

        System.out.println("Average of the given numbers = " + average);

        input.close();
    }
}
