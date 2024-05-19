/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

// Aca segun los ingresado se aplica lo mismo a alimentos solo que en este caso es gato,perro,ave.
// Dando asi las opciones que se relacionan a los gatos, perros o aves.
import javax.swing.*;

public class Accesorios {
    public static void accesoriosMascotas() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de animal (perro, gato, aves):");
        String[] accesorios;
        double[] precios;
        if (tipo.equalsIgnoreCase("perro")) {
            accesorios = new String[]{"Collar", "Correa", "Juguete"};
            precios = new double[]{3000.0, 2000.0, 2500.0};
        } else if (tipo.equalsIgnoreCase("gato")) {
            accesorios = new String[]{"Rascador", "Cama", "Juguete"};
            precios = new double[]{5000.0, 10000.0, 2500.0};
        } else {
            accesorios = new String[]{"Jaula", "Comedero", "Bebedero"};
            precios = new double[]{15000.0, 2000.0, 2500.0};
        }
        String accesorio = (String) JOptionPane.showInputDialog(null, "Seleccione el accesorio para " + tipo + ":", "Accesorios", JOptionPane.QUESTION_MESSAGE, null, accesorios, accesorios[0]);
        int index = java.util.Arrays.asList(accesorios).indexOf(accesorio);
        double precio = precios[index];
        PetShop.addTotal(precio);
        String detalle = "Accesorio para " + tipo + ": " + accesorio + " - " + String.format("%.2f", precio) + " colones";
        Factura.addDetalle(detalle);
        JOptionPane.showMessageDialog(null, detalle);
    }
}
// Aca se usa Arrays para asociar el index con sus costos, para luego mostrarlos en la facturacion.
// Igual como en todo se muestra en todas las clases se muestra un precio del servicio antes de agregarlos al carrito(factura.)