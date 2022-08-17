public class CheckAlphabet {
    public static void main(String[] args) {
        char ch = '0';

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch+" is an alphabet");
        } else {
            System.out.println(ch+" is not an alphabet");
        }

        String str = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')?(ch+" is an alphabet"): (ch+" is not an alphabet");

        System.out.println(str);


        //Java Program to Check Alphabet using isAlphabetic() Method
        if(Character.isAlphabetic(ch)){
            System.out.println(ch+" is an alphabet");
        } else {
            System.out.println(ch+" is not an alphabet");
        }
    }
}
