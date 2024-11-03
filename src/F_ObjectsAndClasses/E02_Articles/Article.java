package F_ObjectsAndClasses.E02_Articles;

public class Article {

    // Object characteristics
    private String title;
    private String content;
    private String author;

    //Getters
    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Methods
    public void changeContent(String content) {
        this.content = content;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public void printArticle() {
        System.out.printf("%s - %s: %s", this.title, this.content, this.author);
    }

    // Constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
