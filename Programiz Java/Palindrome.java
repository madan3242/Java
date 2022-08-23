//Java Program to Check Palindrome

public class Palindrome {
    public static void main(String[] args){

        // Java Program to Check Palindrome String
        String str = "Madan", reverseStr = "";
        int strLength = str.length();
        for(int i = (strLength-1); i>= 0; i--){
            reverseStr += str.charAt(i);
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is not Palindrome");
        }

        // Java Program to Check Palindrome Number
        int num = 347743, reversed = 0;
        int originalNum = num;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }
        if(originalNum == reversed){
            System.out.println(originalNum+" is Palindrome");
        }
        else{
            System.out.println(originalNum+" is not Palindrome");
        }
    }
}
