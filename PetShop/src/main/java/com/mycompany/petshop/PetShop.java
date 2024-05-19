/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petshop;


import javax.swing.*;
// Esta es el "main Class" aca se da inicio y se guardan datos de el nombre Usuario y la bievenida.

public class PetShop {
    private static double total = 0;
    private static String nombreUsuario;

    public static void main(String[] args) {
        nombreUsuario = JOptionPane.showInputDialog("Bienvenido al PetShop, por favor ingrese su nombre:");
        Menu menu = new Menu(nombreUsuario);
        menu.mostrar();
    }

    public static void addTotal(double amount) {
        total += amount;
    }

    public static double getTotal() {
        return total;
    }

    public static void resetTotal() {
        total = 0;
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }
}


