/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;


import javax.swing.*;
// En la peluqueria se agrega el formato de fecha, se pide (dd/mm/aaaa), y se agrega con un valor de 12000.
// Al final se agrega a la variable detalle, la cual es lo que llamara la clase Factura para mostrar los servicios.

public class Peluqueria {
    public static void peluqueria() {
        double precio = 12000; 
        PetShop.addTotal(precio);
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la cita (dd/mm/aaaa):");
        String detalle = "Peluquería para el " + fecha + " - " + String.format("%.2f", precio) + " colones";
        Factura.addDetalle(detalle);
        JOptionPane.showMessageDialog(null, detalle);
    }
}

