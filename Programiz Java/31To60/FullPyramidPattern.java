//Programs to display pyramid and inverted pyramid using * and digits
class FullPyramid{
    int rows = 5, k = 0;
    public FullPyramid(){
        for(int i = 1; i <= rows; ++i, k = 0){
            for(int space = 1; space <= rows - i; ++space){
                System.out.print(" ");
            }
            while(k != 2 * i - 1){
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}

class FullPyramidNum{
    int rows = 5, k = 0, count = 0, count1 = 0;
    public FullPyramidNum(){
        for(int i = 1; i <= rows; i++){
            for(int space = 1; space <= rows - i; space++){
                System.out.print(" ");
                ++count;
            }
            while(k != 2 * i - 1){
                if(count <= rows -1){
                    System.out.print((i + k) + " ");
                    ++count;
                }
                else{
                    ++count1;
                    System.out.print((i + k - 2 * count1)+ " ");
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.println();
        }
    }
}
public class FullPyramidPattern {
    public static void main(String[] args) {
        FullPyramid p = new FullPyramid();

        FullPyramidNum p1 = new FullPyramidNum();
    }    
}
