//Convert char array to String
public class CharArrayToString {
    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};
        String str = String.valueOf(ch);
        String str2 = new String(ch);

        System.out.println(str);
        System.out.println(str2);
    }
}
