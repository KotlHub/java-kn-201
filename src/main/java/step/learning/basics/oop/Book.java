package step.learning.basics.oop;

@Serializable
public class Book extends Literature implements Copyable, Printable, Multiple {
    private int count;
    private String author;

    public Book(String author, String title, int count) {
        this.setAuthor(author);
        super.setTitle(title);
        this.count = count;
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

    @Override
    public int GetCount() {
        return count;
    }
}
