//Java Program to Remove All Whitespaces from a String

public class RemoveWhitespace {
    public static void main(String[] args) {
        String sentence = "T     his   is b ett     er    .";
        System.out.println("Original sentence: " +sentence);

        // sentence = sentence.replaceAll("\\s", "");
        sentence = sentence.replaceAll(" ", "");

        System.out.println("After replacement : "+sentence);
    }
}
