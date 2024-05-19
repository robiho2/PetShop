/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;


//Factura muestra todos los servicios contenidos en detalle y suma lo contenido en total, ademas que saca el iva de este.

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private static List<String> detalles = new ArrayList<>();

    public static void addDetalle(String detalle) {
        detalles.add(detalle);
    }

    public static List<String> getDetalles() {
        return detalles;
    }
// Se utiliza append para unir y dar el formato un poco mas visualmente atractivo.
    public static void mostrarFactura() {
        double iva = PetShop.getTotal() * 0.13;
        double totalConIva = PetShop.getTotal() + iva;
        StringBuilder factura = new StringBuilder("<html><body><h1>Detalle de Factura de " + PetShop.getNombreUsuario() + ":</h1><ul>");
        for (String detalle : detalles) {
            factura.append("<li>").append(detalle).append("</li>");
        }
        factura.append("</ul>")
               .append("<p>Total sin IVA: ").append(String.format("%.2f", PetShop.getTotal())).append(" colones</p>")
               .append("<p>IVA (13%): ").append(String.format("%.2f", iva)).append(" colones</p>")
               .append("<p>Total con IVA: ").append(String.format("%.2f", totalConIva)).append(" colones</p>")
               .append("</body></html>");
        JOptionPane.showMessageDialog(null, factura.toString());
        PetShop.resetTotal();
        detalles.clear(); 
        // Al final se borran los datos, con el fin de iniciar de nuevo.
    }
}



