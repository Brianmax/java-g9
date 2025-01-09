package ejercicio4;

public class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemId, boolean isLoaned, String author) {
        super(title, itemId, isLoaned);
        this.author = author;
    }

    public Book() {

    }
    @Override
    public void showDetails() {
        System.out.println("Title book: " + title);
        System.out.println("Item id book: " + itemId);
        System.out.println("Is loaned book: " + isLoaned);
        System.out.println("Author book: " + author);
    }
}
