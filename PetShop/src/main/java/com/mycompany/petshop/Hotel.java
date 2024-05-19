/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;


import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
// Se utiliza Date y Simple Date Format, esto para poder parsear la fecha y hacer calculos para sacar el costo total segun el numero de dias.

public class Hotel {
    private static final double PRECIO_POR_DIA = 5000;
    
    public enum TipoMascota {
    PERRO, GATO, AVES
}

public enum TipoAlimento {
    CACHORRO, ADULTO, SENIOR
}
// Utilizamos enum para dar las opciones a seleccionar y no tener que digitarlas y mantener la integridad de ele tipo de dato ingresado.


    public static void servicioHotel() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String nombreMascota = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
            TipoMascota tipoMascota = obtenerTipoMascota();
            String checkIn = JOptionPane.showInputDialog("Ingrese la fecha de check-in (dd/mm/aaaa):");
            String checkOut = JOptionPane.showInputDialog("Ingrese la fecha de check-out (dd/mm/aaaa):");
            Date startDate = sdf.parse(checkIn);
            Date endDate = sdf.parse(checkOut);
            long difference = endDate.getTime() - startDate.getTime();
            long days = difference / (24 * 60 * 60 * 1000);
            double precioTotal = days * PRECIO_POR_DIA;
            PetShop.addTotal(precioTotal);
            String detalle = "Servicio de hotel para " + nombreMascota + " (" + tipoMascota + ") del " + checkIn + " al " + checkOut + " - " + String.format("%.2f", precioTotal) + " colones";
            Factura.addDetalle(detalle);
            JOptionPane.showMessageDialog(null, detalle);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con las fechas proporcionadas.");
        }
    }

    private static TipoMascota obtenerTipoMascota() {
        String[] opciones = { "Perro", "Gato", "Aves" };
        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de mascota:", "Tipo de Mascota", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        return TipoMascota.valueOf(seleccion.toUpperCase());
    }
}




