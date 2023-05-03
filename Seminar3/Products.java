package Seminar3;

public class Products {
    String name;
    String sort;
    Integer cost;

    public Products(String name, String sort, Integer cost) {
        this.name = name;
        this.sort = sort;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", cost=" + cost +
                '}';
    }

}
