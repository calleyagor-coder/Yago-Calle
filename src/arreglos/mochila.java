/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class mochila {
    public static void main(String[] args) {
        String[] mochila = {"goma", "cuchillo", "hoja rallada", "lapiz", "pipa salada", "compu del gobierno"};
   
        JOptionPane.showMessageDialog(null,mochila[2]); 
        JOptionPane.showMessageDialog(null,mochila[4]);
        
        for (int i=0; i<mochila.length; i++) {
            JOptionPane.showMessageDialog(null,mochila[i]);
        }
    }
}