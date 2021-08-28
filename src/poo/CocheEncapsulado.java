package poo;

public class CocheEncapsulado {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;

    public CocheEncapsulado() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
        color = "azul";
    }

    public String dimeLargoo() {
        return "El largo del coche es " + this.largo;
    }

    public String dimeDatosGenerales() {
        return "La plataforma del vehiculo tiene " + this.ruedas + " ruedas y mide " + this.ancho + " metros de ancho y un peso de plataforma de " + this.peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return this.color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
