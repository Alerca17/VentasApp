package Ventas.Modelo;

public class DispositivoEntrada {

    private String tipoDeEntrada;
    private String marca;

    public DispositivoEntrada(String marca, String tipoDeEntrada) {

        this.marca = marca;
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {

        return " [ " +
               "Marca: " + marca + " , " +
               "Tipo De Entrada: " + tipoDeEntrada +
               " ] ";
    }
}
