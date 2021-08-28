package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

    public static void main(String[] args) {
        /*
        Empleado empleadoNuevo = new Empleado("Jose Alexander Lozano Velasco", 85000, 2020, 2, 14);
        Empleado empleadoNuevo1 = new Empleado("Maria Camila Lozano Velasco", 105000, 2020, 2, 14);
        Empleado empleadoNuevo2 = new Empleado("Sandra Milena Velasco", 95000, 2020, 2, 14);
        empleadoNuevo.subeSueldo(5);
        empleadoNuevo1.subeSueldo(5);
        empleadoNuevo2.subeSueldo(5);

        System.out.println("Nombre: " + empleadoNuevo.getNombre() + " Sueldo: " + empleadoNuevo.getSueldo() + " Fecha de alta: " + empleadoNuevo.getFechaContrato());
        System.out.println("Nombre: " + empleadoNuevo1.getNombre() + " Sueldo: " + empleadoNuevo1.getSueldo() + " Fecha de alta: " + empleadoNuevo1.getFechaContrato());
        System.out.println("Nombre: " + empleadoNuevo2.getNombre() + " Sueldo: " + empleadoNuevo2.getSueldo() + " Fecha de alta: " + empleadoNuevo2.getFechaContrato());
         */

        Empleado[] misEmpleados = new Empleado[7];

        Jefatura jefeRRHH = new Jefatura("Santiago Rua Lozano", 80000, 2019, 3, 25);
        jefeRRHH.estableceIncentivo(2570);

        misEmpleados[0] = new Empleado("Jose Alexander Lozano Velasco", 85000, 2020, 2, 14);
        misEmpleados[1] = new Empleado("Maria Camila Lozano Velasco", 105000, 2020, 2, 14);
        misEmpleados[2] = new Empleado("Sandra Milena Velasco", 95000, 2020, 2, 14);
        misEmpleados[3] = new Empleado("Estefani Lozano");
        misEmpleados[4] = new Jefatura("Jose Santos Lozano Aragón", 55000, 2019, 3, 25);
        misEmpleados[5] = new Jefatura("Sandy Yurani Lozano Velasco", 95000, 2019, 3, 25);

        misEmpleados[6] = jefeRRHH; // POLIMORFISMO PRINCIPIO DE SUSTITUCIÓN
        Jefatura jefeFinanzas = (Jefatura)misEmpleados[5];  // CASTING O REFACTORIZACIÓN DE UN OBJETO SIEMPRE TENER CUIDADO CON LA HERENCIA
        System.out.println(jefeFinanzas.tomarDecisiones("dar mas dias de vacaciones a los empleados"));

        jefeFinanzas.estableceIncentivo(55000);

        System.out.println("----------------------EMPLEADOS------------------");

        Arrays.sort(misEmpleados);
        for (Empleado element: misEmpleados) {
            element.subeSueldo(5);
            System.out.println("id. " + element.getId() + " Nombre: " + element.getNombre() + " Sueldo: " + element.getSueldo() + " Fecha de alta: " + element.getFechaContrato());
        }
    }
}

class Empleado implements Comparable {

    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    private static int Idiguiente;
    private int Id;


    public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        this.fechaContrato = calendario.getTime();

        ++Idiguiente;
        this.Id = this.Idiguiente;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    // Ordenado por el valor del sueldo
    public int compareTo(Object miObjecto) {
        Empleado otroEmpleado = (Empleado)miObjecto;

        if(this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo > otroEmpleado.getSueldo()) {
            return 1;
        }
        return 0;
    }

    public int getId() {
        return this.Id;
    }
    public String getNombre() {
        return this.nombre;
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


class Jefatura extends Empleado implements Jefes{

    private double incentivo;
    private String decision;

    public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre, sueldo, agno, mes, dia); // Llama al constructor de la clase padre
    }

    public void estableceIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo();// almaceno el sueldo desde la clase padre
        return sueldoJefe + incentivo;
    }

    @Override
    public String tomarDecisiones(String decision) {
        this.decision = decision;
        return "Un miembro de finanzas a tomado la decision de " + this.decision;
    }
}