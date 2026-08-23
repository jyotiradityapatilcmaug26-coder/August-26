public class StringConcate {

    public static void main(String[] args) {

        String firstText = "hello";
        String secondText = "world";

        String combinedText = firstText + secondText;

        boolean sameReference = combinedText == firstText;

        System.out.println(
            "Does combinedText refer to the same object as firstText? "
            + sameReference
        );
    }
}
