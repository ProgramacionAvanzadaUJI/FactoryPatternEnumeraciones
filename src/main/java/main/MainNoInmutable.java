package main;

import cliente.Cliente;
import fabrica.FabricaEnumeracionNoInmutable;

import java.util.Scanner;

/**
 * Created by oscar on 4/4/16.
 */
public class MainNoInmutable {
    public static void main(String[] args) {
        new MainNoInmutable().launch();
    }

    private void launch() {
        FabricaEnumeracionNoInmutable opcion;
        do {
            menu();
            opcion = pideOpcion();
            filtraOpcion(opcion);
        } while (opcion != FabricaEnumeracionNoInmutable.SALIR);
    }

    private FabricaEnumeracionNoInmutable pideOpcion() {
        Scanner scanner = new Scanner(System.in);
        return FabricaEnumeracionNoInmutable.enteroATipo(scanner.nextInt());
    }

    private void filtraOpcion(FabricaEnumeracionNoInmutable opcion) {
//        Scanner scanner = new Scanner(System.in);
        Cliente cliente;
        switch (opcion) {
            case PARTICULAR:
                cliente = opcion.getCliente("123", "Oscar", "Belmonte");
                System.out.println(cliente);
                break;

            case EMPRESA:
                cliente = opcion.getCliente("234", "UJI");
                System.out.println(cliente);
                break;

            case SALIR:
                break;
        }
    }

    private void menu() {
        System.out.println(FabricaEnumeracionNoInmutable.opciones());
    }
}
