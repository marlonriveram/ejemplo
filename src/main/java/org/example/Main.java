package org.example;

import org.example.MODELOS.Cliente;

public class Main {
    public static void main(String[] args) {
        // como se usa una clase?
        //una clase se usa creando una copia de la clase
        //la copia de la clase se conoce como instanica
        // tambien conocida como clase

        //que es un objeto
        //un objeto es una variable especial
        //cuyo tipo de dato es el nombre de la clase
        //que representa

        Integer edad = 35;

        // creando una copia de la clase cliente
        //creando objeto de clase cliente

        //Cliente objeto = new Cliente();

        //Producto objeto2 = new Producto();

        //mostrar los atributos de la clase

        //System.out.println(edad);
        //System.out.println(objeto);
        //System.out.println(objeto2.nombres);

        Cliente cliente = new Cliente("marlon","sabanete");

    }
}