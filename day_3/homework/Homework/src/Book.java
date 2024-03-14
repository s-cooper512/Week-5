public class Book {
    private String title;
    private String author;

    static int librarySize = 0; //static items remain persistent across all instances of an object, rather than initializing a new instance of the variable every time a new version of the object is created

    public static void main(String[] args) {

    }

    public Book () {
//        this.setAuthor("");
//        this.setTitle("");
//        librarySize++;
        this("","");
    }

    public Book (String inputTitle, String inputAuthor) {
        //"this" is used to refer to the current instance of the Book class' variables
        //commented out for part 6
        /*this.author = inputAuthor;
        this.title = inputTitle;*/

        this.setTitle(inputTitle);
        this.setAuthor(inputAuthor);
        librarySize++;
    }

    public Book (String inputTitle) { //Because this overloaded constructor only calls for a single String variable, Java will know to call this method instead of the above one because of the number of parameters given.

        //commented out for part 6
        /*this.title = inputTitle;
        this.author = "Unknown";*/

//        this.setTitle(inputTitle);
//        this.setAuthor("Unknown");
//        librarySize++;
        this(inputTitle, "Unknown");
    }

    public String getTitle () {
        return (title);
    }

    public String getAuthor() {
        return (author);
    }


    //"this" is used to refer to the current instances of title and author referenced in the current Book class
    public void setTitle (String input) {
        if (input.length() > 3 && input != null) {
            this.title = input;
        } else {
            throw new IllegalArgumentException("Title " + input + " is not a valid title. Titles must be more than three characters long");
        }
    }

    public void setAuthor (String input) {
        if (input.length() > 3 && input != null) {
            this.author = input;
        } else {
            throw new IllegalArgumentException("Author " + input + " is not a valid author. Authors must be more than three characters long");
        }
    }

    public void publishBook () {
        System.out.println("Title: " + this.title + " By: " + this.author);
    }

    public static void checkLibrarySize () {
        System.out.println("Number of books: " + librarySize);
    }
}
