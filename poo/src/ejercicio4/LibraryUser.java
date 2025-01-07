package ejercicio4;

import poo_basico.Person;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private int userId;
    private ArrayList<LibraryItem> loanedItems = new ArrayList<>();

    public LibraryUser(String username, int userId) {
        this.username = username;
        this.userId = userId;
    }

    public void showLoanedItems() {
        System.out.println(loanedItems);
    }

    public void addLoanedItem(LibraryItem libraryItem) {
        loanedItems.add(libraryItem);
    }

}
