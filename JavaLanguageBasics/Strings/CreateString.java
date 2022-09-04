class CreateString{
    public static void main(String[] args) {
        //Creating Strings
        String greeting = "Hello World!";

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};

        String helloString = new String(helloArray);

        System.out.println(helloString);
    }
}