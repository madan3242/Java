public class CheckStringsIsNum {
    public static void main(String[] args) {
        String str = "15425.15";
        boolean numeric = true;

        try{
            double num = Double.parseDouble(str);
        }catch(NumberFormatException e){
            numeric = false;
        }

        if(numeric){
            System.out.println(str+" is a number");
        }
        else{
            System.out.println(str+" is not a number");

        }
    }
}
