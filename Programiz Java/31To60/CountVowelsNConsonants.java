public class CountVowelsNConsonants {
    public static void main(String[] args){
        String line = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, space = 0;

        line = line.toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                ++vowels;
            }
            else if(ch >= 'a' && ch <= 'z'){
                ++consonants;
            }
            else if(ch >= '0' && ch <= '9'){
                ++digits;
            }
            else if(ch == ' '){
                ++space;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
        System.out.println("Numbers : "+digits);
        System.out.println("White spaces : "+space);
    }
}
