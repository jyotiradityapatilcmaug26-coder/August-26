public class StringWithNew {

    public static void main(String[] args) {

        String firstText = new String("hello");
        String secondText = new String("hello");

        boolean sameReference = firstText == secondText;
        boolean sameContent = firstText.equals(secondText);

        System.out.println("Using == : " + sameReference);
        System.out.println("Using .equals() : " + sameContent);
    }
}
