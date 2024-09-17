package nl.han.se.bewd.springboottest.controller;

import nl.han.se.bewd.springboottest.domein.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getBook() {
        Book book = new Book("69", "dfdf", "man");
        return book;
    }


    //    @Autowired
//    private BookService bookService;
//
//    @PostMapping(produces = "application/json")
//    public ResponseEntity<Book> add(@RequestBody Book book) {
//        Book addedBook = bookService.add(book);
//        return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
//    }
}
