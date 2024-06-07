package Ventas.Modelo;

public class Mouse extends DispositivoEntrada{

    private final int codigo;
    private static int contadorMouse;

    public Mouse(String marca, String tipoDeEntrada) {

        super(marca, tipoDeEntrada);
        codigo = ++contadorMouse * contadorMouse + 2;
    }

    @Override
    public String toString() {

        return "Mouse [" +
               "Codigo: " + codigo +
               "]" + super.toString();
    }
}
