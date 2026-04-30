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
public class myPlaylist {
    public static void main(String[] args) {
            String[] myPlaylist= {"lo que siento-CUCO", "fly me to the moon-Megumi Hayashibara", "hero-Meego", "salvia-ataquemos", "love-wave to earth"};
        
            JOptionPane.showMessageDialog(null,myPlaylist[0]);
            JOptionPane.showMessageDialog(null,myPlaylist[4]);
            
        for (int i=0; i<myPlaylist.length; i++) {
            JOptionPane.showMessageDialog(null,myPlaylist[i]);
        }
    }
}
