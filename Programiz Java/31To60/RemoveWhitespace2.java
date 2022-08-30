//Take string from users and remove the white space

import java.util.Scanner;

public class RemoveWhitespace2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentence = s.nextLine();

        System.out.println("Original strring : "+ sentence);
        sentence = sentence.replaceAll(" ", "");

        System.out.println("Final string: "+ sentence);
    }
}
