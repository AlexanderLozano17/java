package poo;

public class Uso_Coche {
    public static void main(String[] args){

        Coche Renault = new Coche();

        CocheEncapsulado cocheEncapsulado = new CocheEncapsulado();
        cocheEncapsulado.setLargo(2001);

        System.out.println(Renault.peso);
        System.out.println(cocheEncapsulado.getMotor());
        System.out.println(cocheEncapsulado.dimeLargoo());
    }
}
