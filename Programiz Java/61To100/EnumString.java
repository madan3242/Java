public class EnumString {
    public enum TextStyle{
        BOLD, ITALICS, INDERLINE, STRIKETHROUGH
    }
    public static void main(String[] args) {
        String style = "Italics";

        TextStyle ts = TextStyle.valueOf(style.toUpperCase());

        System.out.println(ts);
    }
}
