//Convert Byte Array to Hex value

public class ByteArrayToHex {
    public static void main(String[] args) {
        byte[] bytes = {10, 11, 12, 13, 14, 16};

        for(byte b : bytes){
            String str = String.format("%02X", b);
            System.out.println(str);
        }
    }
}
