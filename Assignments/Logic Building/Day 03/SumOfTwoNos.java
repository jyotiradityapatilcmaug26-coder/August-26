import java.util.Scanner;

public class SumOfTwoNos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int total = sumOfTwoNumbers(firstNumber, secondNumber);

        System.out.println("Sum of " + firstNumber + " and "
                + secondNumber + " = " + total);

        input.close();
    }

    public static int sumOfTwoNumbers(int first, int second) {

        return first + second;
    }
}
