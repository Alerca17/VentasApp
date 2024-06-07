package Ventas.Modelo;

public class Monitor {

    private final int codigo;
    private String marca;
    private int tamano;
    private static int contadorMonitores;

    private Monitor(){

        codigo = ++contadorMonitores * contadorMonitores + 3;
    }

    public Monitor(String marca, int tamano) {

        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor [" +
               "Codigo: " + codigo + "] [ " +
               "Marca: " + marca + " , " +
               "Tamano: " + tamano +
               " ] ";
    }
}
