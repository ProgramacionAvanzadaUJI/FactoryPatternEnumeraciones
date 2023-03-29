package fabrica;

import cliente.Cliente;
import cliente.Empresa;
import cliente.Particular;
import cliente.Salir;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by oscar on 4/4/16.
 */
public enum FabricaEnumeracionNoInmutable {
    PARTICULAR("Particular.", Particular.class),
    EMPRESA("Empresa.", Empresa.class),
    SALIR("Salir", Salir.class);

    private String descripcion;
    private Class<? extends Cliente> cliente;
    private static final Cliente NULL  = new Empresa("No se pudo crear", "");

    private FabricaEnumeracionNoInmutable(String descripcion, Class<? extends Cliente> cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    public Cliente getCliente(String... args) {
        try {
            if(args.length == 2)
                return cliente.getConstructor(String.class, String.class).newInstance(args);
            else if(args.length == 3)
                return cliente.getConstructor(String.class, String.class, String.class).newInstance(args);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return NULL;
    }

    public static String opciones() {
        StringBuilder sb = new StringBuilder();
        for(FabricaEnumeracionNoInmutable tipo: values())
            sb.append(tipo.ordinal() + ".- " + tipo.descripcion + "\n");
        return sb.toString();
    }

    public static FabricaEnumeracionNoInmutable enteroATipo(int posicion) {
        return values()[posicion];
    }

}
