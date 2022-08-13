public class Operators {

    public static void main(String[] args){
        // Assignment operator 
        // int cadence = 0;
        // int speed = 0;
        // int gear = 1;


        //Arithmetic Operator
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);
        

        // a += 1;
        // b -= 1;
        // c *= 1;
        // d /= 1;

        // The + operator can also be used for concatenating (joining) two strings together
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);


        //Unary operator
        int result1 = +1;
        // result is now 1
        System.out.println(result);

        result1--;
        // result is now 0
        System.out.println(result);

        result1++;
        // result is now 1
        System.out.println(result);

        result1 = -result1;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);


        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;               
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);


        // Relational operator
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 >= value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        //Conditional operator

        // int value1 = 1;
        // int value2 = 2;
        // if ((value1 == 1) && (value2 == 2))
        //     System.out.println("value1 is 1 AND value2 is 2");
        // if ((value1 == 1) || (value2 == 1))
        //     System.out.println("value1 is 1 OR value2 is 1");
        

        //ternary operator
        // boolean someCondition = true;
        // result = someCondition ? value1 : value2;
    
        // System.out.println(result);

    }
}
