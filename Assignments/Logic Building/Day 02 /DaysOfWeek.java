import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int dayCode = input.nextInt();

        switch (dayCode) {
            case 1:
                System.out.println("Selected Day: Monday");
                break;

            case 2:
                System.out.println("Selected Day: Tuesday");
                break;

            case 3:
                System.out.println("Selected Day: Wednesday");
                break;

            case 4:
                System.out.println("Selected Day: Thursday");
                break;

            case 5:
                System.out.println("Selected Day: Friday");
                break;

            case 6:
                System.out.println("Selected Day: Saturday");
                break;

            case 7:
                System.out.println("Selected Day: Sunday");
                break;

            default:
                System.out.println("Invalid day number. Please enter 1 to 7.");
        }

        input.close();
    }
}
