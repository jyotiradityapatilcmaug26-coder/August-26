import java.util.Scanner;

public class SearchArrayElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] values = new int[5];

        System.out.println("Enter 5 integers:");

        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchValue = input.nextInt();

        boolean found = false;

        for (int value : values) {
            if (value == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " is present in the array.");
        } else {
            System.out.println(searchValue + " is not present in the array.");
        }

        input.close();
    }
}
