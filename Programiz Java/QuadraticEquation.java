// Java Program to Find all Roots of a Quadratic Equation

public class QuadraticEquation {
    public static void main(String[] args){
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        //calculate determinant
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (+b + Math.sqrt(determinant)) / (2 * a);

            System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if(determinant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.printf("root1 = root2 = %.2f", root1);
        }
        else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("root1 = %.2f+%.2fi \n", real, imaginary);
            System.out.printf("root2 = %.2f+%.2fi", real, imaginary);
        }
    }
}
