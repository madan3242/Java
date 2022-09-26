class Test{
    public static void main(String[] args) {
        System.out.println("Hello - 1");
        // System.out.println(10/0); 
        // ArithmeticException: / by zero
        System.out.println("Hello - 2");

        
        try{
            int[] arr = new int[4];
            arr[0] = 2;
            arr[1] = 3;
            arr[2] = 4;
            arr[3] = 6;
            arr[4] = 5;
            System.out.println(arr);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}