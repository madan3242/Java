import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo{
    public static void main(String[] args) {
        try{
            PrintWriter p = new PrintWriter("data.txt");
            p.println("Hello there");
        }
        catch(FileNotFoundException e){
            e.getStackTrace();
        }
    }
}