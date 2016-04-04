package cliente;

/**
 * Created by oscar on 4/4/16.
 */
public abstract class Cliente {
    private String nif;
    private String nombre;

    public Cliente(String nif, String nombre) {
        super();
        this.nif = nif;
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nif + ", " +
                nombre;
    }
}
