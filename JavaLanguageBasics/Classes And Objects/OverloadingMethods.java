class DataArtist {
    
    public void draw(String s) {
        // ...
    }
    public void draw(int i) {
        // ...
    }
    public void draw(double f) {
        // ...
    }
    public void draw(int i, double f) {
        // ...
    }
}


public class OverloadingMethods {
    public static void main(String[] args) {
        DataArtist da = new DataArtist();

        da.draw("Hello");
    }
}
