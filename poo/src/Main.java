import herencia.Persona;
import poo_basico.Computer;
import poo_basico.Person;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("George", "Maxi", 27);
        Person person2 = new Person("Jose", "Perez", 13);
        /*person1.name = "George";
        person1.lastname = "Maxi";
        person1.age = 27;

        person2.name = "George";
        person2.lastname = "Maxi";
        person2.age = 27;*/

        person1.sayHi();

        person1.sayHiToSomeone("Jose");
        System.out.println("==========================================");
        person2.sayHiToSomeone("Jose");

        System.out.println("==========================================");

        int respuestaSuma = person1.sum(5 , 5);

        System.out.println("La respuesta de la suma es: " + respuestaSuma);


        Computer computer1 = new Computer();
        computer1.setBrand("HP");// computer1.brand = "HP";
        computer1.setModel("ZD23");//computer1.model = "ZD23";
        computer1.setRam(8);//computer1.ram = 8;
        computer1.setStorage(512);//computer1.storage = 512;

        System.out.println(computer1.getBrand());
        System.out.println("===========================================");
        computer1.printInfo();

        computer1.aumentarAlmacenamiento(256);

        System.out.println("===========================================");

        computer1.printInfo();


        System.out.println("===========================================");

        System.out.println(person1);
        System.out.println(person2);


        Person person3 = new Person("Jhon", "Brody", 25);
        Person person4 = new Person();

    }
}