//Java Code To Create Pyramid and Pattern
class HalfPyramid{
    //Program to print half pyramid using *
    int rows = 5;
    public void Pyramid(){
        for(int i = 1; i <= rows; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class HalfPyramidNumbers{
    // Program to print half pyramid a using numbers
    int rows = 5;
    public void Pyramid(){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

class HalfPyramidAlpabets{
    char alphabet = 'A', last = 'E';
    //Program to print half pyramid using alphabets
    public void Pyramid(){
        for(int i = 1; i <= (last - 'A' + 1); i++){
            for(int j = 1; j <= i; j++){
                System.out.print(alphabet + " ");
            }
            ++alphabet;
            System.out.println();
        }
    }
}

class InvertedPyramidPattern{
    int rows = 5;
    public void Pyramid(){
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

public class PyramidPattern {
    public static void main(String[] args) {
        HalfPyramid h = new HalfPyramid();
        h.Pyramid();

        HalfPyramidNumbers h1 = new HalfPyramidNumbers();
        h1.Pyramid();

        InvertedPyramidPattern h2 = new InvertedPyramidPattern();
        h2.Pyramid();
    }
}
