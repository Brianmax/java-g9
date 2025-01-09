package ejercicio4;

import poo_basico.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems = new ArrayList<>();
    private ArrayList<LibraryUser> libraryUsers = new ArrayList<>();


    public void addItem(LibraryItem item) {
        libraryItems.add(item);
    }
    public void loanItem(int itemId, int userId) {
        // verificar que el item exista y este disponible
        // verificar que el usuario exista
        // hacer el prestamo

        LibraryItem libraryItem = findLibraryItem(itemId);

        LibraryUser libraryUser = findLibraryUser(userId);
        if(libraryItem == null || libraryUser == null) {
            System.out.println("Error al hacer el prestamo");
            return;
        }

        libraryItem.setLoaned(true);
        libraryUser.getLoanedItems().add(libraryItem);
        System.out.println("Prestamo realizado con exito");
    }
    // implementar los metodos
    // => addItem();
    // => showAllItems();
    // => en caso que el usuario tenga mas de tres items prestados
    // negar el prestamo

    public void showAllItems() {
        System.out.println("===================Items=================");
        for(LibraryItem item: libraryItems) {
            item.showDetails();
            System.out.println("========================");
        }
    }
    private LibraryItem findLibraryItem(int itemId) {

        for(LibraryItem item: libraryItems) {
            if(item.getItemId() == itemId && !item.isLoaned()) {
                return item;
            }
        }
        return null;
    }

    private LibraryUser findLibraryUser(int userId) {

        for(LibraryUser user: libraryUsers) {
            if(user.getUserId() == userId && user.getLoanedItems().size() < 3) {
                return user;
            }
        }
        return null;
    }

}
