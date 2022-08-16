public class BreakDemo {
    public static void main(String[] args){
        int[] arrOfInts = {
            10 , 14, 60, 80,
            1 , 4, 78, 8,
            12 , 33, 0, 18,
        };

        int searchEle = 140;

        boolean foundIt = false;
        int i;
        for (i = 0; i < arrOfInts.length; i++) {
            if(arrOfInts[i] == searchEle){
                foundIt = true;
                break;
            }
        }
        if(foundIt){
            System.out.println(searchEle+" found at position "+i);
        }else{
            System.out.println(searchEle+ " not found");
        }
    }
}
