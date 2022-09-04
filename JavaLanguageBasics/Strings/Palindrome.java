public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();

        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // palindrome.getChars(0, len, tempCharArray, 0);
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len - 1 - i];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
