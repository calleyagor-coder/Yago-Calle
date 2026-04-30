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
public class alumnoMain {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("ingrese su nombre:");
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa tu nota:"));
        
        alumno datos = new alumno(nombre, nota1);
        
        datos.aprobo();
        
    }
}
