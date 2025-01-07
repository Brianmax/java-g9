package ejercicio4;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> libraryUsers;

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
            if(user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

}
