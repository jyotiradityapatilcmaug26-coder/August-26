import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversedText = "";

        for (int position = text.length() - 1; position >= 0; position--) {
            reversedText = reversedText + text.charAt(position);
        }

        if (text.equalsIgnoreCase(reversedText)) {
            System.out.println("The given string is a Palindrome.");
        }
        else {
            System.out.println("The given string is not a Palindrome.");
        }

        input.close();
    }
}
