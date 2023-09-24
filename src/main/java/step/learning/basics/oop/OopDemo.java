package step.learning.basics.oop;

public class OopDemo {
    public void run()
    {
        Book book = new Book("D.Knuth", "Art of programming");
        Book book2 = new Book("Jean Baudrillard", "The Consumer Society");

        Library library = new Library() ;
        library.add(book);
        library.add(book2);
        library.printAllCards() ;
    }
}
