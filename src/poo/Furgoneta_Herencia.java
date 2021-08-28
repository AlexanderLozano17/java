package poo;

public class Furgoneta_Herencia extends CocheEncapsulado {

    private int capacidadCarga;
    private int plazasExtras;

    public Furgoneta_Herencia(int capacidadCarga, int plazasExtras) {
        super();// Llama el constructor de la clase padre y da un estado inicial a la clase furgoneta
        this.capacidadCarga = capacidadCarga;
        this.plazasExtras = plazasExtras;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de cargas es: " + this.capacidadCarga + " y las plazas son " + this.plazasExtras;
    }
}
