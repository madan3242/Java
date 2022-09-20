public class StringDemo{
    public static void main(String[] args) {
        // String s1 = "String one";
        // String s2 = "String one";
        // String s3 = new String("String three");
        // String s4 = new String("String three");

        // System.out.println(s1 == s2);
        // System.out.println(s3 == s4);

        String s1 = new String("Hello");
        s1 = s1.concat(" World");
        System.out.println(s1);

        s1 = s1.concat(" Another Hello");
        System.out.println(s1);

        s1.concat("World");


        // StringBuffer sb = new StringBuffer();

        // StringBuilder sbb = new StringBuilder();

    }
}