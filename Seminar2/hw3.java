package Seminar2;

public class hw3 {
    public static void main(String[] args) {


        int[] array = new int[]{1, 2, 5, 6, 7, -2, -4, 7, -9};
        int sum = 0;
        for (int i = 0; i < array.length -1; i++) {
            if(array[i] % 2 == 0){
                sum += i;
            }
        }
        for (int i = 0; i < array.length ; i++) {
            if( array[i] < 0){
                array[i] = sum;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    
}
