package main;

import fabrica.FabricaEnumeracion;

import java.util.Scanner;

/**
 * Created by oscar on 4/4/16.
 */
public class Main {
    public static void main(String[] args) {
        new Main().launch();
    }

    private void launch() {
        FabricaEnumeracion opcion;
        do {
            menu();
            opcion = pideOpcion();
            filtraOpcion(opcion);
        } while(opcion != FabricaEnumeracion.SALIR);
    }

    private void filtraOpcion(FabricaEnumeracion tipo) {
        System.out.println(tipo.getContador().cuenta());
    }

    private FabricaEnumeracion pideOpcion() {
        Scanner scanner = new Scanner(System.in);
        return FabricaEnumeracion.enteroATipo(scanner.nextInt());
    }

    private void menu() {
        System.out.println(FabricaEnumeracion.opciones());
    }
}
