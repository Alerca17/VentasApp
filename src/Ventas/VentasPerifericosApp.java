package Ventas;

import Ventas.Modelo.Monitor;
import Ventas.Modelo.Mouse;
import Ventas.Modelo.Perifericos;
import Ventas.Modelo.Teclado;
import Ventas.Servicio.Orden;

public class VentasPerifericosApp {

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Vsg", "Tipo C");
        Teclado teclado = new Teclado("Vsg", "Tipo C");
        Monitor monitor = new Monitor("ACER", 27);
        Perifericos perifericos = new Perifericos("Pc Alerca",monitor,mouse,teclado);

        //Agregar una orden
        Orden orden = new Orden();

        orden.agregarPeriferico(perifericos);
        orden.mostrarOrden();

    }
}