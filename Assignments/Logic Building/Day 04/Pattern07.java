public class Pattern07 {

    public static void main(String[] args) {

        int value = 1;

        for (int row = 1; row <= 5; row++) {

            for (int position = 1; position <= row; position++) {
                System.out.print(value + " ");
                value++;
            }

            System.out.println();
        }
    }
}
