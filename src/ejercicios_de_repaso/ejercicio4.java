package ejercicios_de_repaso;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    
        System.out.println("nombre de la reseta: ");
        String nomreset=sc.nextLine();
        System.out.println("ingredientes principales: ");
        String ingre=sc.nextLine();
        System.out.println("tiempo de preparación(en min): ");
        String tiemp=sc.nextLine();
        System.out.println("difcultad(facil,medio,dificil): ");
        String difi=sc.nextLine();
        
        System.out.println("que te valla bien en tus "+nomreset+" :D");
    }
}
