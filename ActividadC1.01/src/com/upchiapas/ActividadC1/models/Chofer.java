package com.upchiapas.ActividadC1.models;

public class Chofer {

    private String id;
    private String nombre;
    private Vehiculo[] listaVehiculos;

    private byte numeroTaxi;


    public Chofer(int numeroVehiculos){
        listaVehiculos = new Vehiculo[numeroVehiculos];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getnumeroTaxi(){
        return numeroTaxi;
    }

    public void setnumeroTaxiumeroTaxi(){this.numeroTaxi = numeroTaxi;
    }

}
