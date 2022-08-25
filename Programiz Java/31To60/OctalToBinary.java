//Program to Convert Octal to Binary
public class OctalToBinary {
    public static void main(String[] args) {
        int octal = 67;
        long binary = convertOctalToBinary(octal);
        System.out.println(octal+" in binary = "+binary+ " in binary");
    }

    static long convertOctalToBinary(int octalNumber){
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while(octalNumber != 0){
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }
        i = 1;

        while(decimalNumber != 0){
            binaryNumber += (decimalNumber % 2)*i;
            decimalNumber /= 2;
            i *= 10;
        }
    
        return binaryNumber;
    }
}
