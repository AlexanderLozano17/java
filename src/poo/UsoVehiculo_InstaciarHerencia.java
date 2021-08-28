package poo;

public class UsoVehiculo_InstaciarHerencia {
    public static void main(String[] args) {
        CocheEncapsulado micoche1 = new CocheEncapsulado();
        micoche1.setColor("Rojo");

        Furgoneta_Herencia furgoneta = new Furgoneta_Herencia(500, 7);
        furgoneta.setColor("Verde");

        System.out.println(furgoneta.dimeDatosGenerales() + furgoneta.dimeDatosFurgoneta());

    }
}
