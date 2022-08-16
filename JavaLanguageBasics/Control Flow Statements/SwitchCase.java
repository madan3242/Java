public class SwitchCase {
    public static void main(String[] args){
        int quarter = 5; // any value

        String quarterLabel = null;
        switch (quarter) {
            case 0: quarterLabel = "Q1 - Winter"; 
                    break;
            case 1: quarterLabel = "Q2 - Spring"; 
                    break;
            case 2: quarterLabel = "Q3 - Summer"; 
                    break;
            case 3: quarterLabel = "Q3 - Summer"; 
                    break;
            default: quarterLabel = "Unknown quarter";
        };
        System.out.println(quarterLabel);
    }
}
