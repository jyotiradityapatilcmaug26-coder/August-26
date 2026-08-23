public class Pattern01 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int count = 1; count <= row; count++) {
                System.out.print(row);

                if (count != row) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        for (int row = 5; row >= 2; row--) {

            for (int count = 1; count <= row; count++) {
                System.out.print(row);

                if (count != row) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
