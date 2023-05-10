package Seminar4;

import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = 1;
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        while(list.size()>1) {

            System.out.println(list.getLast());
            list.removeLast();
        }
    }
}