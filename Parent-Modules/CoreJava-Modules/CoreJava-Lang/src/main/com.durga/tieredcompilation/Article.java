package tieredcompilation;
/**
 * @author durga on 8/12/2021
 */
public class Article {

    private final String name;
    private final String author;

    public Article(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}
