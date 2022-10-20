public interface Connect {
    void m1();
    default void m2(){
        System.out.println("m2() method");
    }
}
