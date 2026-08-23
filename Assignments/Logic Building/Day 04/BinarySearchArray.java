import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Enter the number to search: ");
        int searchNumber = input.nextInt();

        int index = Arrays.binarySearch(numbers, searchNumber);

        if (index >= 0) {
            System.out.println(
                "The number " + searchNumber + " is found at index " + index
            );
        } else {
            System.out.println("Not Found");
        }

        input.close();
    }
}
