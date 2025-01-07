package ejercicio4;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> libraryItems;

    public void loanItem(int itemId, int userId) {
        // verificar que el item exista y este disponible
        // verificar que el usuario exista
        // hacer el prestamo

        LibraryItem libraryItem = findLibraryItem(itemId);

        if(libraryItem == null) {
            System.out.println("Item no encontrado o no disponible");
            return;
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
    
}
