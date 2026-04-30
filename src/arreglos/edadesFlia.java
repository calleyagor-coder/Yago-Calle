/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author LABO B 11
 */
public class edadesFlia {
    public static void main(String[] args) {
        String[] edadesFlia= {"42", "38", "17", "14", "3"};
        
        JOptionPane.showMessageDialog(null,edadesFlia[1]);
            
        for (int i=0; i<edadesFlia.length; i++) {
            JOptionPane.showMessageDialog(null,edadesFlia[i]);
        }
    }
}