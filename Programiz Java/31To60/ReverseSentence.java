//Java Program to Reverse a Sentence Using Recursion

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Go To Work";
        String reversed = reverse(sentence);
        System.out.println("Reversed Sentence = "+reversed);
    }
    static String reverse(String sentence){
        if(sentence.isEmpty())
            return sentence;
        
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
