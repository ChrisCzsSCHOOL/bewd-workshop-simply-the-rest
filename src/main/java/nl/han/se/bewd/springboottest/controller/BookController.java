package nl.han.se.bewd.springboottest.controller;

import nl.han.se.bewd.springboottest.domein.Book;
import nl.han.se.bewd.springboottest.domein.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

//    @GetMapping("/book")
//    public Book getBook() {
//        Book book = new Book();
//        book.setIbsn("1234-5678-9101");
//        book.setTitle("Sefa adventures 2");
//        book.setAuthor("Sefa");
//        return book;
//    }

    @Autowired
    private BookService bookService;

    @PostMapping(produces = "application/json")
    public ResponseEntity<Book> add(@RequestBody Book book) {
        Book addedBook = bookService.add(book);
        return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
    }
}
