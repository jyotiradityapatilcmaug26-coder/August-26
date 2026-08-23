public class StringWithSameContent {

    public static void main(String[] args) {

        String firstText = "java";
        String secondText = "java";
        String thirdText = "java";

        boolean sameReference =
                (firstText == secondText) && (secondText == thirdText);

        System.out.println(
                "All strings point to the same object: " + sameReference
        );
    }
}
