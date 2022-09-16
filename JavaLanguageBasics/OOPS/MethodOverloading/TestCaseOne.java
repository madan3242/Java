public class TestCaseOne{
    public void wish(String s){
        System.out.println("String");
    }
    public void wish(StringBuffer sb){
        System.out.println("String Buffer");
    }
    public static void main(String[] args) {
        TestCaseOne t1 = new TestCaseOne();
        t1.wish("Good moring");
        t1.wish(new StringBuffer("Welcome"));
    }
}