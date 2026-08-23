import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== JAVA LOGIC MENU =====");
            System.out.println("1. Grade Evaluation");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Display Variable Values");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    gradeEvaluation(input);
                    break;

                case 2:
                    leapYearCheck(input);
                    break;

                case 3:
                    dayOfWeek(input);
                    break;

                case 4:
                    displayValues();
                    break;

                case 5:
                    System.out.println("Program closed successfully.");
                    break;

                default:
                    System.out.println("Invalid option! Please choose 1 to 5.");
            }

        } while (choice != 5);

        input.close();
    }

    public static void gradeEvaluation(Scanner input) {

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        System.out.print("Enter Science marks: ");
        double science = input.nextDouble();

        System.out.print("Enter History marks: ");
        double history = input.nextDouble();

        double average = (maths + science + history) / 3;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        }
        else if (average >= 70) {
            System.out.println("Grade: B");
        }
        else if (average >= 50) {
            System.out.println("Grade: C");
        }
        else if (average >= 30) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }
    }

    public static void leapYearCheck(Scanner input) {

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " is a Leap Year.");
        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static void dayOfWeek(Scanner input) {

        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number.");
        }
    }

    public static void displayValues() {

        byte smallNumber = 25;
        short marks = 850;
        int total = 4562;
        long distance = 18600L;

        float temperature = 28.5f;
        double percentage = 89.75;

        char grade = 'P';
        boolean passed = true;

        System.out.println("Byte      : " + smallNumber);
        System.out.println("Short     : " + marks);
        System.out.println("Int       : " + total);
        System.out.println("Long      : " + distance);
        System.out.println("Float     : " + temperature);
        System.out.println("Double    : " + percentage);
        System.out.println("Character : " + grade);
        System.out.println("Boolean   : " + passed);
    }
}
