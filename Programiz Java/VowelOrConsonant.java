//Java Program to Check Whether an Alphabet is Vowel or Consonant

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is consonant");
        }

        //Check whether an alphabet is vowel or consonant using switch statement
        ch  = 'y';
        switch(ch){
            case 'a': case 'e': case 'i':
            case 'o': case 'u':
                System.out.println(ch + "is vowel");
                break;
            default: 
                System.out.println(ch + " is consonant");
                break;
        }
    }
}
