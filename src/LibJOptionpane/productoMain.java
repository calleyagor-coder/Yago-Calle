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
public class productoMain {
    public static void main(String[] args) {
        
        String nombre=JOptionPane.showInputDialog("ingrese el producto:");
        double precio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto:"));
        
        producto data=new producto(nombre, precio);
        
        data.escaro();
    }
}
