package Seminar3.hw3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class appbook {

    public static void main(String[] args) {
        List<Book> books = getBook();

        List<String> nameBooks = new ArrayList<>();

        for(Book book: books){
            if(simpleNumber(book.pages)){
                if(book.author.contains("a")){
                    if(book.year > 2009){
                        nameBooks.add(book.name);
                    }
                }
            }
        }

        System.out.println(nameBooks);
    }

    public static ArrayList<Book> getBook(){

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("War and Peace","Tolstoy",3000,1865,1300));
        books.add(new Book("sdc","Grega",1200,2009,587));
        books.add(new Book("isdu","Brown",800,2010,1142));
        books.add(new Book("oiuy","Ridgas",950,2015,491));
        books.add(new Book("mwef","Tolkan",250,2020,252));

        return books;

    }

    public static boolean simpleNumber(int pages){
        Integer integer = pages;
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        
        return probablePrime;
    }

}
