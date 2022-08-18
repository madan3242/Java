public class ArmstrongNumber {
    public static void main(String[] args) {
        // abcd... = an + bn + cn + dn + ...
        // 153 = 1*1*1 + 5*5*5 + 3*3*3  153 is an Armstrong number.

        int number = 371, originalNumber, reminder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            reminder = originalNumber % 10;
            result += Math.pow(reminder, 3);
            originalNumber /= 10;
        }
        if (result == number) {
            System.out.println(number+" is a Armstrong number.");
        } else {
            System.out.println(number+" is not a Armstrong number.");
            
        }
    }
}
