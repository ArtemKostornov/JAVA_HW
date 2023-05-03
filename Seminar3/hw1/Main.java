package Seminar3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Products product = new Products("высший апельсин", "1", 350);
        Products product2 = new Products("высший абрикос", "2", 250);
        Products product3 = new Products("простой банан", "2", 30);
        Products product4 = new Products("простой виноград", "3", 35);
        Products product5 = new Products("высший мандарин", "1", 300);
        List<Products> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        Integer biggestCost = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).sort.contains("1") || productList.get(i).sort.contains("2")) {
                if (productList.get(i).name.contains("высший")) {
                    if(productList.get(i).cost > biggestCost) {
                        biggestCost = productList.get(i).cost;
                    }


                }

            }
        }
        System.out.println(biggestCost);
    }
    
}
