public class RunnableEx {
    public static void main(String[] args) {
        String name = "Madan";
        Runnable r1 = () -> System.out.println(name);
        r1.run();

        String uName = name.toUpperCase();
        Runnable r2 = () -> System.out.println(uName);
        r2.run();
    }
}
