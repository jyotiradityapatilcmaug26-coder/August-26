public class StringSameObjectCheck {

    public static void main(String[] args) {

        String firstText = "hello";
        String secondText = "hello";

        boolean sameReference = firstText == secondText;

        System.out.println(
            "Do both variables point to the same object? "
            + sameReference
        );
    }
}
