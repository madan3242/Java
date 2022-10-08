public class CircleImpl{

    public static void main(String[] args) {
        // Circle c = (double radius) -> System.out.println(Math.PI * radius * radius);

        Circle c = r -> Math.PI * r * r;

        
        System.out.println(c.calculateArea(5));
    }
}
 