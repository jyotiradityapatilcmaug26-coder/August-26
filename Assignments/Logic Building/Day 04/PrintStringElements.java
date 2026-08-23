import java.util.Scanner;

public class PrintStringElements {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter 5 names:");

        for (int index = 0; index < names.length; index++) {
            names[index] = input.next();
        }

        System.out.println("Names entered:");

        for (String name : names) {
            System.out.print(name + " ");
        }

        input.close();
    }
}
