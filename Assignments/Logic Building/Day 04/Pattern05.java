public class Pattern05 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int repeat = 1; repeat <= row; repeat++) {
                System.out.print(row);
            }

            System.out.println();
        }
    }
}
