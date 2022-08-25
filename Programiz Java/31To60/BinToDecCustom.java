//Binary to Decimal Conversion Using Custom Method

public class BinToDecCustom {
    public static void main(String[] args) {
        long num = 110110111;

        int decimal = convertBinaryToDecimal(num);
        
        System.out.println(num+ " in binary = " +decimal+" in decimal");
    }

    public static int convertBinaryToDecimal(long n){
        int decimalNumber = 0, i = 0;
        long remainder;
        while(n != 0){
            remainder = n % 10;
            n /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
