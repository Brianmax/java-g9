package ejercicio4;

public class App {
    public static void main(String[] args) {

        DVD dvd1 = new DVD("Spiderman", 2, false, "Sam Raymi", 160);

        Book book1 = new Book("Harry Potter", 1, false, "J.K.Rowling");

        //book1.showDetails();

        //dvd1.showDetails();

        LibraryItem libraryItem1 = new Book(
                "Harry Potter",
                1,
                false,
                "J.K.Rowling");

        LibraryItem libraryItem2 = new DVD(
                "Spiderman",
                2,
                false,
                "Sam Raymi",
                160);

        //libraryItem1.showDetails();

        //libraryItem2.showDetails();

        LibraryUser user = new LibraryUser("george12", 12);

        Library library = new Library();

        library.addItem(libraryItem1);
        System.out.println("=============================================");
        library.addItem(libraryItem2);

        library.showAllItems();
    }
}
