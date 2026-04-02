package ejercicios_de_repaso;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("ingrese su nombre: ");
        String nombreempleado=sc.nextLine();
        System.out.println("ingrese su edad: ");
        int edad=sc.nextInt();
        System.out.println("Ingrese su salario: ");
        double salario=sc.nextDouble();
        
        System.out.println("su nombre es: "+nombreempleado);
        System.out.println("tienes "+edad+" años");
        System.out.println("tiene un salario de $"+salario);
    }
}
