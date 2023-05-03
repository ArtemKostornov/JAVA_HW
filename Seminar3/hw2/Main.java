package Seminar3.hw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Items> item = getItem();
        int lowCost = 10000000;

        Scanner sc = new Scanner(System.in);
        String searchSortItem = sc.nextLine();
        for (int i = 0; i < item.size(); i++) {
            if(item.get(i).sort.equals(searchSortItem)){
                if(lowCost > item.get(i).cost){
                    lowCost = item.get(i).cost;
                }
            }
        }
        for (int i = 0; i < item.size(); i++) {
            if(item.get(i).sort.equals(searchSortItem)) {
                if (lowCost == item.get(i).cost){
                    System.out.println(item.get(i).name);
                }
            }

        }
    }
    public static ArrayList<Items> getItem(){
        ArrayList<Items> item = new ArrayList<Items>();
        item.add(new Items("milk", "French",70,35,"2"));
        item.add(new Items("meat", "French",80,40,"1"));
        item.add(new Items("eggs", "Poland",60,15,"2"));
        item.add(new Items("coffee", "England",20,15,"2"));
        item.add(new Items("chocolate", "French",30,50,"1"));
        item.add(new Items("parrot", "French",100,40,"1"));
        return item;
    }
    
}
