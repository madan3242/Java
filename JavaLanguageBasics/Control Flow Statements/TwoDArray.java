class TwoDArray{
    public static void main(String[] args){
        int[][] arr = {{3, 4, 6, 1, 7}, {9, 5, 6, 4, 3}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.println("arr["+i+"]["+j+"] : "+arr[i][j]);
            }
        }

        for(int[] a : arr){
            for(int b: a){
                System.out.println(b);
            }
        }
    }
}