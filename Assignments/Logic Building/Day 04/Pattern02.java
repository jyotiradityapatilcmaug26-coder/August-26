public class Pattern02 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int number = 1; number <= row; number++) {

                System.out.print(number);

                if (number < row) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
