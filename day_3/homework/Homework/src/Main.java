import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        Book book2 = new Book("Restaurant At the End Of the Universe");
        //Book book3 = new Book(); //Commented out after confirming error throw was functioning
        Book book4 = new Book("Life, The Universe, & Everything", "Douglas Adams");
        Book book5 = new Book("So Long & Thanks For All the Fish");

        ArrayList<Book> trilogy = new ArrayList<Book>(Arrays.asList(book1, book2, book4));

        book1.publishBook();
        book2.publishBook();
        //book3.publishBook(); //Commented out to prevent exception introduced in part 7
        book4.publishBook();
        book5.publishBook();

        Book.checkLibrarySize();

        for (int i = 0; trilogy.size() > i; i++) {
            System.out.println("Book in trilogy #" + (i+1) + ": " + trilogy.get(i).getTitle());
        }
    }
}