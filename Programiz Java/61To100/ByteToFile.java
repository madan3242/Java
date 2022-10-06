import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteToFile {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "\\CreateString\\src\\test.txt";
        String finalPath = System.getProperty("user.dir") + "\\CreateString\\src\\final.txt";

        try{
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalPath), encoded);
        }catch(IOException e){
            
        }
    }
}
