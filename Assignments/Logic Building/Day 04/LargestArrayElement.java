import java.util.Scanner;

public class LargestArrayElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[5];

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

        int largestValue = values[0];

        for (int value : values) {
            if (value > largestValue) {
                largestValue = value;
            }
        }

        System.out.println("Largest element = " + largestValue);

        input.close();
    }
}
