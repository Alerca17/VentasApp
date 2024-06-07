package Ventas.Modelo;

public class Perifericos {

    private final int codigo;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static int contadorPerifericos;

    private Perifericos() {

        codigo = ++contadorPerifericos * contadorPerifericos + 4;
    }

    public Perifericos(String nombre, Monitor monitor, Mouse mouse, Teclado teclado) {

        this();
        this.monitor = monitor;
        this.mouse = mouse;
        this.nombre = nombre;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Perifericos { [" +
               "Codigo: " + codigo + "]  " +
               "Nombre: " + nombre +
               ", Monitor: " + monitor +
               ", Teclado: " + teclado +
               ", Mouse: " + mouse +
               "}";
    }
}
