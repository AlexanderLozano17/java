package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

    public static void main(String[] arg) {
        /*
        Empleado empleado[] = new Empleado[3];
        empleado[0] = new Empleado("Alexander Lozano", 27, 234445);
        empleado[1] = new Empleado("Camila Velasco", 18, 234445);
        empleado[3] = new Empleado("Santiago Rua", 5, 234445);
        */

        // Despues de 10 elementos consume mas recursos ya que solo guarda 10, si supera ese número crea una copia con los elementos superiores a 10 y elimina la anterior.
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(new Empleado("Camila Velasco", 18, 234445));
        listaEmpleados.add(new Empleado("Alexander Lozano", 27, 234445));
        listaEmpleados.add(new Empleado("Santiago Rua", 5, 234445));

        // Adiciona un nuevo item al ArrayList en la posicion que se quiera
        listaEmpleados.set(1, new Empleado("Jose Santos Lozano", 52, 1200000));

        System.out.println("Cuantos elementos hay en el ArrayList " + listaEmpleados.size());
        System.out.println("---------------------------");

        listaEmpleados.trimToSize();// recupera recursos del ArrayList

        for (Empleado e: listaEmpleados) {
            System.out.println(e.dameDatos());
        }

        // Obtiene un item o elemento del ArrayList
        System.out.println("---------------------------");
        System.out.println("Capturando un item del ArrayList - " + listaEmpleados.get(1).dameDatos());

        System.out.println("-------------ITERADOR--------------");
        Iterator<Empleado> miIterador = listaEmpleados.iterator();

        while (miIterador.hasNext()) {
            System.out.println(miIterador.next().dameDatos());
        }
    }
}

class Empleado {

    private String nombre;
    private int edad;
    private double salario;


    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos() {
        return "nombre: " + this.nombre + " edad: " + this.edad + " salario: " + this.salario;
    }
}
