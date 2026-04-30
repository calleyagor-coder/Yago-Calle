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
public class personaMain {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("ingrese su nombre:");
        int edad=JOptionPane.showConfirmDialog(null,"¿usted tiene 18 años o más?");
        
        persona data=new persona(nombre, edad);
        
        data.esmayordeedad();
    }
    
}
