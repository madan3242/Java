// package CreateString;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFileTwo {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String text = "Another added text";

        try{
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
}
