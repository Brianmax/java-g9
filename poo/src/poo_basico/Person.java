package poo_basico;

public class Person {
    // atributos
    public String name;
    public String lastname;
    public int age;

    public Person(String name, String lastname, int age) {
        System.out.println("Hola desde el constructor");
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Person() {
        System.out.println("Ejecutando constructor vacio");
    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    // metodos

    public void sayHi() {
        System.out.println("Hola a todos");
    }

    public void sayHiToSomeone(String name) {
        System.out.println("Mi nombre es: " + this.name);
        System.out.println("Hola " + name);
    }

    public int sum(int a, int b) {
        System.out.println(name + " esta pensando...");
        int respuesta = a + b;
        return respuesta;
    }
}
