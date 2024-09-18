package nl.han.se.bewd.springboottest.controller;

import nl.han.se.bewd.springboottest.domein.Book;
import nl.han.se.bewd.springboottest.domein.Bookrecord;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public ResponseEntity<Bookrecord> getBook() {
        var book = new Bookrecord("69", "dfdf", "man");
        return ResponseEntity.status(201).body(book);
    }

    @PostMapping
    public ResponseEntity<Bookrecord> postBook(@RequestParam String ibsn, String title, String author) {
        var addedBook = new Bookrecord(ibsn, title, author);
        return ResponseEntity.status(200).body(addedBook);
    }
}
