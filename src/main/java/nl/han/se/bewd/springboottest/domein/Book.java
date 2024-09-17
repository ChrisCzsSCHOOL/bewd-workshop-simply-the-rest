package nl.han.se.bewd.springboottest.domein;

public class Book {
    private String ibsn;
    private String title;
    private String author;

    public Book(String ibsn, String title, String author) {
        this.ibsn = ibsn;
        this.title = title;
        this.author = author;
    }

    public String getIbsn() {
        return ibsn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
