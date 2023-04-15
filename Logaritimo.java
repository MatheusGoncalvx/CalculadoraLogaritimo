/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logaritimo;

/**
 *
 * @author ADM
 */

import javax.swing.JOptionPane;

public class Logaritimo {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        double num = Double.parseDouble(input);
        double logaritmo = Math.log10(num);
        JOptionPane.showMessageDialog(null, "O logaritmo natural de " + num + " é " + logaritmo);
    }
}

