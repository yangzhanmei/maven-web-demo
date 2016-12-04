package demo.dao;

import demo.models.Book;

import java.util.List;
import java.util.ArrayList;


public class booksDao {
    private static List<Book>  newList= new ArrayList<Book>();
    public static List<Book> getBooks(){
        return newList;
    }

    public static void addBooks(String title,String description){
        Book book = new Book();
        book.setTitle(title);
        book.setDescription(description);
//        List<Book> newList = new ArrayList<Book>();
        newList.add(book);
    }
}
