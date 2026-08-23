import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {

        System.out.println("Welcome to Age Category Checker");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int userAge = input.nextInt();

        checkAgeCategory(userAge);

        input.close();
    }

    public static void checkAgeCategory(int userAge) {

        if (userAge < 18) {
            System.out.println("Category: Minor");
        }
        else if (userAge < 60) {
            System.out.println("Category: Adult");
        }
        else {
            System.out.println("Category: Senior Citizen");
        }
    }
}
