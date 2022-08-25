//Java Program to Convert Binary Number to Decimal and vice-versa

public class BinaryToDecimal {
    public static void main(String[] args) {
        //Binary to Decimal Conversion Using parseInt()
        String binary = "01010111101101";

        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary+ " in binary = " +decimal+ " in decimal.");
    }
}
