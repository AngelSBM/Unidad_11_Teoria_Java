import java.util.ArrayList;

public class EscritorTecnico extends Empleado {

    ArrayList<String> habilidades = new ArrayList<String>();

    public EscritorTecnico(int id, String nombre, String posicion) {
        super(id, nombre, posicion);
    }

}