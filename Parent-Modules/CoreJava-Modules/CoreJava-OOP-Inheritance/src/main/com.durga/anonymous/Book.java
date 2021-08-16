package anonymous;

/**
 * @author durga on 8/11/2021
 */
public class Book {
    final String title;

    public Book(String title) {
        this.title = title;
    }

    public String description() {
        return "Title: " + title;
    }
}
