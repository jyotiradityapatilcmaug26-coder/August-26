public class Pattern03 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int position = 1; position <= row; position++) {

                System.out.print(2 * position - 1);

                if (position < row) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
