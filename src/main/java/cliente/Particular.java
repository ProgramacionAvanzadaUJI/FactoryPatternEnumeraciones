package cliente;

/**
 * Created by oscar on 4/4/16.
 */
public class Particular extends Cliente {
    private String apellidos;

    public Particular(String nif, String nombre, String apellidos) {
        super(nif, nombre);
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", " + apellidos;
    }
}
