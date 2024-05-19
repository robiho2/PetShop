/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

import javax.swing.JOptionPane;
// Este es el menu principal se inicia con el loop en true mientras sea true el menu es activo
public class Menu {
    private String nombreUsuario;

    public Menu(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void mostrar() {
        boolean continuar = true;
        while (continuar) {
            String menuPrincipal = "Bienvenido " + nombreUsuario + " al PetShop\n"
                + "1. Servicio de Hotel\n"
                + "2. Alimento Mascota\n"
                + "3. Accesorios para Mascotas\n"
                + "4. Peluquería\n"
                + "5. Ver factura y pagar\n"
                + "6. Salir";
            String opcion = JOptionPane.showInputDialog(menuPrincipal);
            
            switch (opcion) {
                case "1":
                    Hotel.servicioHotel();
                    break;
                case "2":
                    Alimentos.alimentoMascota();
                    break;
                case "3":
                    Accesorios.accesoriosMascotas();
                    break;
                case "4":
                    Peluqueria.peluqueria();
                    break;
                case "5":
                    Factura.mostrarFactura();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Gracias " + nombreUsuario + " por visitar nuestro PetShop.");
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor intente de nuevo.");
            }
        }
    }
}

//Opcion 6 pasa el booleano a false saliendo y dando el mensaje de salida.
