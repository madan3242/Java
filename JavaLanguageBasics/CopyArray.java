public class CopyArray {
    public static void main(String[] args){

        // public static void arraycopy(Object src, int srcPos,
        //                      Object dest, int destPos, int length)
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 1, copyTo, 0, 7);

        for (int i = 0; i < copyTo.length; i++) {
            System.out.println(copyTo[i]);
        }
    }
}
