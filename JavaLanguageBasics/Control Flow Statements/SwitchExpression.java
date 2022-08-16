public class SwitchExpression {
    public static void main(String[] args){
        // int day = "...";
        // int len = 0;
        // switch(day) {
        //     case MONDAY:
        //     case FRIDAY:
        //     case SUNDAY:
        //         len = 6;
        //         break;
        //     case TUESSDAY:
        //         len = 7;
        //         break;
        //     case THURSDAY:
        //     case SATURDAY:
        //         len = 8;
        //         break;
        //     case WEDNESDAY:
        //         len = 9;
        //         break;
        // }
        // System.out.println("len  = "+len);

        // Switch Expression
        // int day = ...;
        // int len = {
        //     switch(day){
        //         case MONDAY, FRIDAY, SUNDAY -> 6;
        //         case TUESDAY                -> 7;
        //         case THURSDAY, SATURDAY     -> 8;
        //         case WEDNESDAY              -> 9;
        //     }
        // }
        // System.out.println("len  = "+len);

        int quarter = 1;
        String quarterLabel =
            switch(quarter){
                case 0 -> "Q1 - Winter";
                case 1  -> "Q2 - Spring";
                case 2  -> "Q3 - Summer";
                case 3  -> "Q3 - Summer";
                default -> "Unknown quarter";
            };

        System.out.println(quarterLabel);
    }
}
