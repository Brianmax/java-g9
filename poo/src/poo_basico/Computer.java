package poo_basico;

public class Computer {
    public String brand;
    public String model;
    public int ram;
    public int storage;

    public void printInfo() {
        System.out.println("Info computer");
        System.out.println("La marca es: " + brand);
        System.out.println("El modelo es: " + model);
        System.out.println("La RAM es: " + ram);
        System.out.println("El almacenamiento es: " + storage);
    }

    public void aumentarRam(int aumento) {
        System.out.println("Aumentando RAM" );
        ram += aumento;
    }

    public void aumentarAlmacenamiento(int aumento) {
        System.out.println("Aumentando storage");
        storage += aumento;
    }
}
