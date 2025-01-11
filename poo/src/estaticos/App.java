package estaticos;

import interfaces.Carro;
import interfaces.Moto;
import interfaces.Vehiculo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User user1 = new User("george", "pass");
        User user2 = new User("georg2", "pass2");

        User.num++;

        System.out.println(user1.num);

        user1.num++;

        System.out.println(User.num);

        Vehiculo vehiculo1 = new Carro();

        Vehiculo vehiculo2 = new Moto();


    }
}
