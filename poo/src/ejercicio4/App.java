package ejercicio4;

import java.lang.reflect.Array;
import java.util.ArrayList;

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


        // Declarar tres variables de tipo LibraryItem
        // asignarles como valor un objeto DVD o Book

        LibraryItem l1 = new Book(
                "Harry Potter",
                1,
                false,
                "J.K.Rowling");

        LibraryItem l2 = new Book(
                "El Senior de los Anillos",
                2,
                false,
                "J.R.Tolkien");

        LibraryItem l3 = new DVD(
                "Spiderman",
                2,
                false,
                "Sam Raymi",
                160);

        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("El mundo es ancho y ajeno", 3, false, "Ciro Alegria"));
        libraryItems.add(new Book());
        libraryItems.add(l2);
        libraryItems.add(l3);

        LibraryUser lu1 = new LibraryUser("george12", 12);

        // libraryItems.add(lu1);
    }
}
