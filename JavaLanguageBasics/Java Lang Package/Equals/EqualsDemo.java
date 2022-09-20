public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = new String("String One");
        String s2 = new String("String Two");

        String s3 = new String("String Two");

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
