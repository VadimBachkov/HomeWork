public class Book {
    private String title;
    private String authorName;
    private String text;


    public Book (String name, String authorName){
        this.title = name;
        this.authorName = authorName;
    }

    public Book (String title, String authorName, String text){
        this (title, authorName);
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.title = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setText(String text) {
        this.text = text;
    }
}
