package org.example.MODELOS;

public class Cliente {
    protected String nombres;
    protected String ciudad;

    public Cliente() { // constructor vacio
    }

    public Cliente(String nombres, String ciudad) { // constructor lleno
        this.nombres = nombres;
        this.ciudad = ciudad;
    }
}
