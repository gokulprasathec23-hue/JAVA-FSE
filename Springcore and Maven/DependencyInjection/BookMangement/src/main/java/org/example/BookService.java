package org.example;

public class BookService {
    private BookRepository book;
    public BookRepository getBook() {
        return book;
    }
    public void setBook(BookRepository book) {
        this.book = book;
    }
    public void Bookrepo(){
        book.Repository();
    }
}
