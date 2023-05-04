package Seminar3.hw3;

public class Book {
    public String name;
    public String author;
    public Integer cost;
    public Integer year;
    public Integer pages;

    public Book(String name,String author, Integer cost, Integer year, Integer pages){
        this.name = name;
        this.author = author;
        this.cost = cost;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", cost=" + cost +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }
}
