import java.util.Scanner;

class CheckLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int enteredYear = input.nextInt();

        boolean isLeap = false;

        if (enteredYear % 400 == 0) {
            isLeap = true;
        }
        else if (enteredYear % 100 == 0) {
            isLeap = false;
        }
        else if (enteredYear % 4 == 0) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(enteredYear + " is a Leap Year.");
        }
        else {
            System.out.println(enteredYear + " is not a Leap Year.");
        }

        input.close();
    }
}
