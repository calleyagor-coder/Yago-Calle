/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package arreglos;
    import javax.swing.JOptionPane;
/**
 *
 * @authorR Raul
 */
public class ejemArreglo {
    public static void main(String[] args) {
        String[] inventario = new String[5];
        
        inventario[0] = "Espada";
        inventario[1] = "Pico";
        inventario[2] = "Pan";
        inventario[3] = "Antorcha";
        inventario[4] = "Pala";
        
        for (int i = 0; i < inventario.length; i++) {
            JOptionPane.showMessageDialog(null, inventario[i]);
        }
    }  
}
