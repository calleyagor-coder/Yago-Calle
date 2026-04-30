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
import javax.swing.JOptionPane;
public class comidasFav {
    public static void main(String[] args) {
        String[] comidasFav= {"tarta de jamon y queso", "tajarin", "locro", "estofado", "napolitana"};
        
        JOptionPane.showMessageDialog(null,comidasFav[1]);
        
        for (int i=0; i<comidasFav.length; i++) {
            JOptionPane.showMessageDialog(null,comidasFav[i]);
        }
    }
    
}
