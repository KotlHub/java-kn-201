package step.learning.basics.oop;

public class Book extends Literature{
    private String author;

    public Book(String author, String title) {
        this.setAuthor(author);
        super.setTitle(title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String GetCard() {
        return String.format("Book %s %s",
                super.getTitle(), this.getAuthor());
    }
}
