import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit for addition: ");
        int limit = input.nextInt();

        calculateSum(limit);

        input.close();
    }

    public static void calculateSum(int limit) {

        int total = 0;

        for (int value = 1; value <= limit; value++) {
            total += value;
        }

        System.out.println("Sum from 1 to " + limit + " = " + total);
    }
}
