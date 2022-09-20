public class EqualsVsEqualOp {
    public static void main(String[] args) {
        String s1 = new String("String");
        String s2 = new String("String");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        StringBuffer s3 = new StringBuffer("Hello");
        StringBuffer s4 = new StringBuffer("Hello");

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        // System.out.println(s2 == s4); Incompatible operand types String and StringBuffer
        
        int a = 100;
        int b = 100;

        System.out.println(a == b);
        // System.out.println(a.equals(b)); Cannot invoke equals(int) on the primitive type int
    }
}
