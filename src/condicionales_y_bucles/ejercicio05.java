package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU:");
        System.out.println("1)VER PERFIL");
        System.out.println("2)EDITAR DATOS");
        System.out.println("3)CERRAR SESIÓN");
        System.out.println("INGRESE LA OPCIÓN: ");
        int opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Seleccionaste: la Opción 1: Ver perfil");
                break;
            case 2:
                System.out.println("Seleccionaste: la Opción 2: Editar datos");
                break;
            case 3:
                System.out.println("Seleccionaste: la Opción 3: Cerrar sesión");
                break;
            default:
                System.out.println("No ingresaste ninguna opción");
                
        }
          
    }
}