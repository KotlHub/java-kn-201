package step.learning.basics.oop;

import com.google.gson.Gson;

public class OopDemo {
    public void run()
    {
        Gson gson = new Gson();
        String str = "{\"author\": \"D.Knuth\", \"title\": \"Art of programming\"}";
        Book book3 = gson.fromJson(str, Book.class);
        System.out.println(book3.GetCard());

//        Book book = new Book("D.Knuth", "Art of programming");
//        Book book2 = new Book("Jean Baudrillard", "The Consumer Society");
//
//        Library library = new Library() ;
//        library.add(book);
//        library.add(book2);
//        library.printAllCards() ;
    }
}
