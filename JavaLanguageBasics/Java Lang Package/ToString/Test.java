public class Test{
    // public String toString(){
    //     //Overriding toString() method
    //     return "Test Class";
    // }
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println(t);
        // System.out.println(t.hashCode());
        System.out.println(t.toString());

        String s = new String("Test String");

        System.out.println(s);
        System.out.println(s.hashCode());

        // Integer rollNo = new Integer(101);
        // System.out.println(rollNo);
        // [removal] Integer(int) in Integer has been deprecated and marked for removal
        // Integer rollNo = new Integer(101);
    }
}