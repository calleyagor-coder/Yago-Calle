package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU:");
        System.out.println("1)Saludar");
        System.out.println("2)Mostrar fecha");
        System.out.println("3)Salir");
        System.out.println("ingrese una opción: ");
        int opcion=sc.nextInt();
        
        while(opcion!=3){
            System.out.println("MENU:");
            System.out.println("1)Saludar");
            System.out.println("2)Mostrar fecha");
            System.out.println("3)Salir");
            System.out.println("ingrese una opción nuevamente: ");
            opcion=sc.nextInt();
        }
        System.out.println("bye");

    }
}