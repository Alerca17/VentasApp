package Ventas.Servicio;

import Ventas.Modelo.Perifericos;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private final List<Perifericos> perifericos;


    public Orden() {

        perifericos = new ArrayList<>();
    }

    public void agregarPeriferico(Perifericos periferico) {

        perifericos.add(periferico);
    }

    public void mostrarOrden(){

        perifericos.forEach(System.out::println);
    }


}
