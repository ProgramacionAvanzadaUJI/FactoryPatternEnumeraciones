package fabrica;

import contador.Ascendente;
import contador.Contador;
import contador.Salir;

/**
 * Created by oscar on 4/4/16.
 */
public enum FabricaEnumeracion {
    ASCENDETE("Contador ascendente", new Ascendente()),
    SALIR("Salir", new Salir());

    private String descripcion;
    private Contador contador;

    private FabricaEnumeracion(String descripcion, Contador contador) {
        this.descripcion = descripcion;
        this.contador = contador;
    }

    public Contador getContador() {
        return contador;
    }

    public static String opciones() {
        StringBuilder sb = new StringBuilder();
        for(FabricaEnumeracion tipo: values())
            sb.append(tipo.ordinal() + ".- " + tipo.descripcion + "\n");
        return sb.toString();
    }

    public static FabricaEnumeracion enteroATipo(int posicion) {
        return values()[posicion];
    }
}
