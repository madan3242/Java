// package CreateString;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// Create String from file
public class StringFromFile {
    public static void main(String[] args) throws IOException{
        try{
            
            String path = System.getProperty("user.dir") + "\\src\\test.txt";
            // System.out.println(path);
            Charset encoding = Charset.defaultCharset();
    
            List<String> lines = Files.readAllLines(Paths.get(path), encoding);
            System.out.println(lines);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}