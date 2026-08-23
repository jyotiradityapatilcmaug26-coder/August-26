import java.util.Scanner;

public class GradeEvaluation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        double mathsMarks = input.nextDouble();

        System.out.print("Enter Science marks: ");
        double scienceMarks = input.nextDouble();

        System.out.print("Enter History marks: ");
        double historyMarks = input.nextDouble();

        double averageMarks = (mathsMarks + scienceMarks + historyMarks) / 3;

        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 90) {
            System.out.println("Grade: A");
        }
        else if (averageMarks >= 70) {
            System.out.println("Grade: B");
        }
        else if (averageMarks >= 50) {
            System.out.println("Grade: C");
        }
        else if (averageMarks >= 30) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: Fail");
        }

        input.close();
    }
}
