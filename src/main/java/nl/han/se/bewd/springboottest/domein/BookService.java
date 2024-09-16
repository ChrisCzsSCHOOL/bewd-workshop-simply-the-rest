package nl.han.se.bewd.springboottest.domein;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Book add(Book book) {
        return bookRepo.add(book);
    }
}
