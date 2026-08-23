public class StringIntern {

    public static void main(String[] args) {

        String originalText = new String("hello");

        String pooledText = originalText.intern();

        String literalText = "hello";

        boolean sameReference = pooledText == literalText;

        System.out.println(
            "Do pooledText and literalText refer to the same object? "
            + sameReference
        );
    }
}
