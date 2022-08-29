public class AddComplexNumber {

    double real;
    double imag;

    public AddComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public static void main(String[] args) {
        AddComplexNumber n1 = new AddComplexNumber(2.3, 4.5),
                         n2 = new AddComplexNumber(3.4, 5.0),
                         temp;
        
        temp = add(n1, n2);
        System.out.printf("Sum = %.1f + %.1fi",temp.real, temp.imag );
    }

    public static AddComplexNumber add(AddComplexNumber n1, AddComplexNumber n2){
        AddComplexNumber temp = new AddComplexNumber(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}
