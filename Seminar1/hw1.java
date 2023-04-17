public class hw1 {
    public static void main(String[] args) {
        System.out.println(reverseString("the white blue sky"));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}