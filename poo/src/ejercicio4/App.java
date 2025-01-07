package ejercicio4;

public class App {
    public static void main(String[] args) {

        DVD dvd1 = new DVD("Spiderman", 2, false, "Sam Raymi", 160);

        Book book1 = new Book("Harry Potter", 1, false, "J.K.Rowling");

        book1.showDetails();

        dvd1.showDetails();
    }
}
