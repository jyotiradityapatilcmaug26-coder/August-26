import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversedText = "";

        for (int position = text.length() - 1; position >= 0; position--) {
            reversedText = reversedText + text.charAt(position);
        }

        System.out.println("Reverse of the string: " + reversedText);

        input.close();
    }
}
