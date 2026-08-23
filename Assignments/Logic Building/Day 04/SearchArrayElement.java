import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Integer[] numbers = new Integer[5];

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = input.nextInt();

        if (Arrays.asList(numbers).contains(searchNumber)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        input.close();
    }
}
