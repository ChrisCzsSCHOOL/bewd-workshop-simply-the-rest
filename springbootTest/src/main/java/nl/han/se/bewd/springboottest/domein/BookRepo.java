package nl.han.se.bewd.springboottest.domein;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepo {

    private List<Book> books;

    public BookRepo(List<Book> books) {
        this.books = buildFakeBooks();
    }

    private List<Book> buildFakeBooks() {
        Book book1 = new Book();
        book1.setIbsn("1");
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        Book book2 = new Book();
        book2.setIbsn("2");
        book2.setTitle("Book 2");
        book2.setAuthor("Author 2");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        return books;
    }

    public Book add(Book book){
        Long maxId = findMaxId();
        book.setIbsn(String.valueOf(maxId + 1));
        this.books.add(book);
        return book;
    }

    // begin chatgpt
    private Long findMaxId() {
        return this.books.stream()
                .map(book -> extractNumericPart(book.getIbsn()))
                .map(Long::valueOf)
                .reduce(Long::max)
                .orElse(0L);
    }

    private String extractNumericPart(String isbn) {
        return isbn.replaceAll("[^0-9]", "");
    }
    // einde chatgpt
}
