package nl.han.se.bewd.springboottest.domein;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookList {

    @GetMapping
    public List<Bookrecord> getBooks() {

        return new ArrayList<Bookrecord>();
    }

//    @GetMapping
//    public ResponseEntity<Bookrecord> getBook() {
//        var book = new Bookrecord("69", "dfdf", "man");
//        return ResponseEntity.status(201).body(book);
//    }
//
//    @PostMapping
//    public ResponseEntity<Bookrecord> postBook(@RequestParam String ibsn, String title, String author) {
//        var addedBook = new Bookrecord(ibsn, title, author);
//        return ResponseEntity.status(200).body(addedBook);
//    }
}
