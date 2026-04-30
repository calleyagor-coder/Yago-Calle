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
public class producto {
    
    String nombre;
    double precio;
    
    public producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    
    void escaro(){
        if (precio>10000){
            JOptionPane.showMessageDialog(null,"el producto es caroo");
        }else{
            JOptionPane.showMessageDialog(null,"el producto no es caro");
        }
    }
}
