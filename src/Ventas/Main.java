package Ventas;

import Ventas.Modelo.Monitor;
import Ventas.Modelo.Mouse;
import Ventas.Modelo.Perifericos;
import Ventas.Modelo.Teclado;

public class Main {

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Vsg", "Tipo C");
        Teclado teclado = new Teclado("Vsg", "Tipo C");
        Monitor monitor = new Monitor("ACER", 27);
        System.out.println(mouse);
        System.out.println(teclado);
        System.out.println(monitor);

        Perifericos perifericos = new Perifericos("Pc Alerca",monitor,mouse,teclado);
        System.out.println(perifericos);
    }
}