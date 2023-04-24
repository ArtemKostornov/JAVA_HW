package Seminar2;

public class hw1 {
    public static void main(String[] args) {
        System.out.println(getSum());
    }


    //
    public static int getSum() {
        String str = "67 25 22 23 35 78 2 3 29 100 300 4";
        String[] strNums = str.split(" ");
        int result = 0;
        for (int i = 1; i < strNums.length; i++) {
            int number = Integer.parseInt(strNums[i]);

            Integer integer = number;
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
            if (probablePrime == true) {
                result += number;
            }
        }
        return result;
    }
}
