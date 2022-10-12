// Java Program to convert primitive types to objects and vice versa

public class PrimitiveToObject {
    public static void main(String[] args) {
        int var1 = 5;
        double var2 = 58.24;
        boolean var3 = true;

        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        if(obj1 instanceof Integer){
            System.out.println("An object of Integer is created.");
        }

        if(obj2 instanceof Double){
            System.out.println("An object of Double is created.");
        }

        if(obj3 instanceof Boolean){
            System.out.println("An object of Boolean is created.");
        }
    }
}
