import java.util.Scanner;

public class PrintArrayElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[5];

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

        System.out.println("Array elements are:");

        for (int value : values) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
