// Java Program to convert boolean variables into string
public class BoolToString {
    public static void main(String[] args) {
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;

        String stringValue1 = String.valueOf(booleanValue1);
        String stringValue2 = String.valueOf(booleanValue2);

        // Convert boolean to String using toString()
        // String stringValue1 = Boolean.toString(booleanValue1);
        // String stringValue2 = Boolean.toString(booleanValue2);

        System.out.println(stringValue1);
        System.out.println(stringValue2);
    }
}
