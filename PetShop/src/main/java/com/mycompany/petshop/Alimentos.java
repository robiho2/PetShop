/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;


import javax.swing.*;
//Aca se dan los diferentes tipos de alimentos segun la seleccion ejemplo: si se selecciona cachorro entonces hace display de ascan cachorro y dogchow chachorro.
// Se utiliza el if,else if y else para poder discernir la opcion y mostrar las opciones relacionadas al lo ingresado.


public class Alimentos {
    public static void alimentoMascota() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de alimento (cachorro, adulto, senior):");
        String[] alimentos;
        double[] precios;
        if (tipo.equalsIgnoreCase("cachorro")) {
            alimentos = new String[]{"Ascan cachorro", "Dog chow cachorro"};
            precios = new double[]{8000.0, 8500.0};
        } else if (tipo.equalsIgnoreCase("adulto")) {
            alimentos = new String[]{"Ascan adulto", "Dog chow adulto"};
            precios = new double[]{7500.0, 8000.0};
        } else {
            alimentos = new String[]{"Ascan senior", "Dog chow senior"};
            precios = new double[]{7800.0, 8300.0};
        }
        String alimento = (String) JOptionPane.showInputDialog(null, "Seleccione el alimento para " + tipo + ":", "Compra de Alimento", JOptionPane.QUESTION_MESSAGE, null, alimentos, alimentos[0]);
        int index = java.util.Arrays.asList(alimentos).indexOf(alimento);
        double precio = precios[index];
        PetShop.addTotal(precio);
        String detalle = "Alimento para " + tipo + ": " + alimento + " - " + String.format("%.2f", precio) + " colones";
        Factura.addDetalle(detalle);
        JOptionPane.showMessageDialog(null, detalle);
    }
}


