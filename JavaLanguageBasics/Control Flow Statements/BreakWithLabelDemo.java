/**
 * BreakWithLabelDemo
 */
public class BreakWithLabelDemo {
    public static void main(String[] args){
        int[][] arrayOfInts = {
            {10, 20, 44, 9, 0},
            {7, 89, 66, 34, 12},
            {78, 101, 5, 32, 88}
        };

        int searchOf = 88;
        int i, j = 0;
        boolean foundIt = false;

        search: 
            for(i = 0; i < arrayOfInts.length; i++){
                for(j = 0; j < arrayOfInts[i].length; j++){
                    if (arrayOfInts[i][j] == searchOf) {
                        foundIt = true;
                        break search;
                    }
                }
            }

        if(foundIt){
            System.out.println(searchOf+" found at position ["+i+"] ["+j+"]");
        }else{
            System.out.println(searchOf+" not found");
        }
    }
}