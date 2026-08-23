import java.util.Scanner;

public class CountVowelStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine().toLowerCase();

        int vowelCount = 0;

        for (int position = 0; position < text.length(); position++) {

            char letter = text.charAt(position);

            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u') {

                vowelCount++;
            }
        }

        System.out.println("Total vowels found: " + vowelCount);

        input.close();
    }
}
