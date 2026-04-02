package ejercicios_de_repaso;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        String nombre1="Leonel";
        String nombre2="Andres";
        String apellido="Messi";
     
        System.out.println("Generando email..........");
        System.out.println(nombre1+"_"+nombre2+"_"+apellido+"@CEN.TECH.COM.AR");
    }
}
