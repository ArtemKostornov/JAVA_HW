package Seminar3.hw2;

public class Items {
    public String name;
    public String country;
    public double weight;
    public Integer cost;
    public String sort;

    public Items(String name, String country, double weight, Integer cost, String sort){
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.cost = cost;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", sort='" + sort + '\'' +
                '}';
    }
    
}
