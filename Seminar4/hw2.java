package Seminar4;

public class hw2 {

    public static void main(String[] args) {
        System.out.println(checkSecond("()"));
        System.out.println(checkSecond("() [] {}"));
        System.out.println(checkSecond("(}"));

    }

    static boolean checkSecond(String bracket) {
        char[] array = bracket.toCharArray();
        if (array.length % 2 != 0) return false;
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] == '(') {
                d += array[i + 1] == ')' ? -1 : 1;
            }
            if( array[i] == '[') {
                d += array[i+ 1] == ']' ? -1 : 1;
            }
            if( array[i] == '{') {
                d += array[i+ 1] == '}' ? -1 : 1;
            }
            if (d > 0) return false;
        }
        return true;
    }
}
