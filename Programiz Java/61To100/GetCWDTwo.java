import java.nio.file.Paths;

public class GetCWDTwo {
    public static void main(String[] args) {
        String path = Paths.get("").toAbsolutePath().toString();

        System.out.println("Working Directory = "+path);
    }
}
