/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class autoMain{
    public static void main(String[] args) {
        
        String marca = JOptionPane.showInputDialog("ingresa la marca:");
        String modelo = JOptionPane.showInputDialog("ingresa el modelo:");
        
        auto autito1 = new  auto(marca, modelo);
       
        autito1.arrancar();
    }
}
