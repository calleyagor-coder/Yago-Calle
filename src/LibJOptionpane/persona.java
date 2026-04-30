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
public class persona {
    
    String nombre;
    int edad;
    
    public persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    
    void esmayordeedad(){
        if(edad==0){
            JOptionPane.showMessageDialog(null,"usted "+nombre+" es mayor de edad");
        }if(edad==1){
            JOptionPane.showMessageDialog(null,"usted "+nombre+" es menor de edad");
        }if(edad==2){
            JOptionPane.showMessageDialog(null,"a oks chau.");
        }
    }   
}
