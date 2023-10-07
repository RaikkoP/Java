package Week6.Ex101;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> arrayOfBooks;

    public Library(){
        this.arrayOfBooks = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
        newBook = new Book(newBook.title(), newBook.publisher(), newBook.year());
        this.arrayOfBooks.add(newBook);
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        for( Book book : this.arrayOfBooks){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for ( Book book : this.arrayOfBooks){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : this.arrayOfBooks){
            if(book.year() == year){
                found.add(book);
            }
        }
        return found;
    }

    public void printBooks(){
        for(Object item : arrayOfBooks){
            System.out.println(item);
        }
    }
}
