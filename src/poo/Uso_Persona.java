package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009,02,25);
        lasPersonas[1] = new Alumno("Ana Lopez", "Biológicas");

        for (Persona e: lasPersonas) {
            System.out.println(e.getNombre() + ", " + e.dameDescripcion());
        }
    }
}

/**
 * Si hay un metodo abstracto en una clase, la clase también debe ser abstracta y solo se declara el metodo
 * que debe ser sobreescrito por las clases que heredan
 */
abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract String dameDescripcion();
}

/**
 * Si hay mas clases dentro de otra solo puede haber una clase con el acceso publico y el metodo main
 * final class Empleado {} al declara la clase final evita que otras clases hereden de ella de igual manera con los metodos ya que evita que los sobreescriban
 */
class Empleado2 extends Persona {

    private double sueldo;
    private Date fechaContrato;
    private static int Idiguiente;
    private int Id;


    public Empleado2(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        this.fechaContrato = calendario.getTime();

        ++Idiguiente;
        this.Id = this.Idiguiente;
    }

    public String dameDescripcion() {
        return "Este empleado tiene un " + this.Id + "con un sueldo " + this.sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public Date getFechaContrato() {
        return this.fechaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje/100;
        this.sueldo += aumento;
    }
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    public String dameDescripcion() {
        return "Este alumno esta estudiando la carrera de " + this.carrera;
    }
}