package Ventas.Modelo;

public class Teclado extends DispositivoEntrada {

    private final int codigo;
    private static int contadorTeclados;

    public Teclado(String marca, String tipoDeEntrada) {

        super(marca, tipoDeEntrada);
        codigo = ++contadorTeclados * contadorTeclados + 1;
    }

    @Override
    public String toString() {
        return "Teclado [" +
               "Codigo: " + codigo +
               "] " + super.toString();
    }
}
