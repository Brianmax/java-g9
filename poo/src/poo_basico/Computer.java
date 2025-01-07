package poo_basico;

public class Computer {
    private String brand;
    private String model;
    private int ram;
    private int storage;

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

    // metodos getter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
