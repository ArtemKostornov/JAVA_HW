package Seminar2;

public class hw2 {
    public static void main(String[] args) {
        System.out.println("False = 0, True = 1");
        System.out.println(getSum());
    }

    public static int getSum() {
        String str = "7 20 22 23 35 78 200 500 ";
        String[] strNums = str.split(" ");
        int result = 0;
        for (int i = 1; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);
            int previous = Integer.parseInt(strNums[i - 1]);
            if (number > previous) {
                result += 1;
            }


        }
        if (result != strNums.length - 1) {
            result = 0;
        }
        if (result == strNums.length - 1) {
            result = 1;
        }
        return  result;

    }
    
}
