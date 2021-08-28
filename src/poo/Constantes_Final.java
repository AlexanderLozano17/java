package poo;

public class Constantes_Final {
    public static void main(String[] args) {

        Empleados empleado[] = new Empleados[6];

        empleado[0] = new Empleados("Alexander lozano");
        empleado[1] = new Empleados("Camila Lozano");
        empleado[2] = new Empleados("Yurani Lozano");
        empleado[3] = new Empleados("Jose Santos Lozano");
        empleado[4] = new Empleados("Santiago Rua");
        empleado[5] = new Empleados("Estefani Lozano");

        Secciones seccion = new Secciones();
        String[] listSecciones = seccion.mostrarSecciones();

        int i = 0;
        for (Empleados elemento : empleado) {
            elemento.cambiaSeccion(listSecciones[i++]);
            if (listSecciones.length == i) {
                i = 0;
            }
            // Al llamar un metodo estatico se realiza de la siguiente manera Nombredeclase.MetodoEstaticoClase
            System.out.println(elemento.devuelveDatos() + " " + Empleados.dameIdSiguiente());
        }

    }
}

class Empleados {
    private String nombre;
    private String seccion;
    private int Id;
    // Una variable static quiere decir que es unica para cualquier objeto de la clase no se repite.
    public static int IdSiguiente = 1;

    public Empleados(String nombre){
        this.nombre = nombre;
        this.seccion = "Administración";
        this.Id = this.IdSiguiente;
        this.IdSiguiente++;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "Id " + this.Id + " EL nombre es " + this.nombre + " y la sección es " + this.seccion;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    // Las metodos staticos son solo metodos de clase no de objetos y solo acceden a variables estaticas
    public static String dameIdSiguiente() {
        return "EL Id sigiuente es " + IdSiguiente;
    }
}


class Secciones {
    // Constantes = final
    private final String seccion = "TI";
    private final String seccion1 = "Capacidad Coorporativa";
    private final String seccion2 = "Recursos Humanos";

    public String[] mostrarSecciones() {
        String secciones[] = {
                this.seccion, this.seccion1, this.seccion2
        };
        return secciones;
    }
}
