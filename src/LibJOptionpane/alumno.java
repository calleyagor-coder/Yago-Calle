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
public class alumno {
    
    String nombre;
    int nota;
    
    public alumno(String nombre, int nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    
    void aprobo(){
        if (nota>=6){
            JOptionPane.showMessageDialog(null,"aprobaste pero de lastima");
        }else{
            JOptionPane.showMessageDialog(null,"te vas a febrero");
        }
    }
}
