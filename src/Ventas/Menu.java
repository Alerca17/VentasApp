package Ventas;

import Ventas.Modelo.Monitor;
import Ventas.Modelo.Mouse;
import Ventas.Modelo.Perifericos;
import Ventas.Modelo.Teclado;
import Ventas.Servicio.Orden;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    public Scanner leer = new Scanner(System.in);
    Orden orden = new Orden();

    Monitor monitor;
    Mouse mouse;
    Teclado teclado;
    Perifericos perifericos;

    String marca, tipoEntrada, nombre;
    int tamano, opc;

    public void menuPrincipal() {

        System.out.print("""
                Ingresa Una Opcion
                                
                1). Ingresar Mouse
                2). Ingresar Teclado
                3). Ingresar Monitor
                4). Mostrar Orden
                5). Enviar Orden
                6). Salir
                """);
        System.out.print("Opcion: ");
        opc = leer.nextInt();

        leer.nextLine();

        switch (opc) {

            case 1:
                ingresarMouse();
                menuPrincipal();
                break;

            case 2:
                ingresarTeclado();
                menuPrincipal();
                break;

            case 3:
                ingresarMonitor();
                menuPrincipal();
                break;

            case 4:
                mostrarOrden();
                menuPrincipal();
                break;

            case 5:
                ingresarOrden();
                menuPrincipal();
                break;

            case 6:
                System.exit(0);
                break;

            default:
                System.out.println("Opcion Invalida");
                menuPrincipal();
                break;
        }
    }

    public void ingresarMouse() {

        System.out.print("Introduzca La Marca: ");
        marca = leer.nextLine();
        System.out.print("Introduzca Tipo Entrada: ");
        tipoEntrada = leer.nextLine();
        System.out.println();
        mouse = new Mouse(marca, tipoEntrada);
        System.out.println("Mouse Ingresado Correctamente");
        System.out.println();
    }

    public void ingresarTeclado() {

        System.out.print("Introduzca La Marca: ");
        marca = leer.nextLine();
        System.out.print("Introduzca Tipo Entrada: ");
        tipoEntrada = leer.nextLine();
        System.out.println();
        teclado = new Teclado(marca, tipoEntrada);
        System.out.println("Teclado Ingresado Correctamente");
        System.out.println();

    }

    public void ingresarMonitor() {

        System.out.print("Introduzca La Marca: ");
        marca = leer.nextLine();
        System.out.print("Introduzca El Tamaño: ");
        tamano = leer.nextInt();
        System.out.println();
        monitor = new Monitor(marca, tamano);
        System.out.println("Mouse Ingresado Correctamente");
        System.out.println();
    }

    public void ingresarOrden() {

        System.out.print("Introduzca El Nombre De La Orden: ");
        nombre = leer.nextLine();

        perifericos = new Perifericos(nombre, monitor, mouse, teclado);
        orden.agregarPeriferico(perifericos);
        System.out.println("Orden Agregada Correctamente");
        System.out.println();
    }

    public void mostrarOrden() {

        orden.mostrarOrden();
        System.out.println();
    }
}
