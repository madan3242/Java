public class TestCaseTwo{
    public void wish(Object obj) {
        System.out.println("Object");
    }
    public void wish(String s){
        System.out.println("String");
    }
    public void wish(StringBuffer sb){
        System.out.println("String Buffer");
    }
    public static void main(String[] args) {
        TestCaseTwo t1 = new TestCaseTwo();
        t1.wish(new Object());
        t1.wish("str");
        t1.wish(new StringBuffer("strBuff"));
        t1.wish(null);
        
    }
}