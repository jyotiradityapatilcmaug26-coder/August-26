import java.util.Scanner;

public class PrintNos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        System.out.println("Numbers from 1 to " + limit + ":");

        for (int value = 1; value <= limit; value++) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
