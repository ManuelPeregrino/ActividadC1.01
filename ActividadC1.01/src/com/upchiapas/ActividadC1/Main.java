//Manuel Alejandro Peregrino Clemente   221324
//Yazmín Reyes Ruiz                     221262
//Ana Fernanda Aguilar Vázquez          221227


package com.upchiapas.ActividadC1;

import com.upchiapas.ActividadC1.models.Vehiculo;
import com.upchiapas.ActividadC1.models.Chofer;

import java.util.Scanner;

public class Main {
    public static Chofer[]  listaChofer = new Chofer[5];
    public static Scanner teclado = new Scanner(System.in);
    public static int Ganancia;

    public static void main(String[] args) {

        byte opcion;

        do{
            System.out.println("Universidad Politécnica de Chiapas");
            System.out.println("1 Agregar Persona");
            System.out.println("2 Agregar Vehículo");
            System.out.println("3 Imprimir Choferes");
            System.out.println("4 Imprimir Ganancias");
            System.out.println("5 Salir");
            System.out.println("Seleccione una opción");
            opcion = teclado.nextByte();
            switch (opcion) {
                case 1 -> addChofer();
                case 2 -> addVehiculo();
                case 3 -> imprimirChofer();
                case 4 -> imprimirGanancias();
            }
        }while (opcion<5);

    }
    public static void addChofer(){

        String id;
        String nombre;
        int numeroVehiculos;
        Chofer chofer;
        //Seccion para capturar datos
        System.out.println("Ingresa el ID: ");
        id = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingresa el Nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Vehiculos a registrar");
        numeroVehiculos = teclado.nextInt();


        //Seccion para almacenar datos
        chofer = new Chofer(numeroVehiculos);
        chofer.setId(id);
        chofer.setNombre(nombre);
        Vehiculo.setGanancia(String.valueOf(Ganancia));
        //numeroTaxi.setnumeroTaxi(numeroTaxi);
        }

    public static void addVehiculo(){
        String Placa;
        Vehiculo vehiculo;
        //Seccion para capturar datos
        System.out.println("Ingresa las placas: ");
        Placa = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingresa la ganancia: ");
        Ganancia = teclado.nextInt();
        teclado.nextLine();
        //Seccion para almacenar datos
        Vehiculo.setGanancia(String.valueOf(Ganancia));

    }

    public static void imprimirChofer(){
        System.out.println("Los choferes registrados son");
        for(int i=0;i<listaChofer.length;i++)
        {
            System.out.println(listaChofer[i]);
        }
        }
    public static void imprimirGanancias() {
        System.out.println(Ganancia);
    }
}
