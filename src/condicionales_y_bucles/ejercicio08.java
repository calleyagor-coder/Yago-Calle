package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESE LA CONTRASEÑA: ");
        String XXX=sc.nextLine();
        
        while(!XXX.equals("lachavona123")){
            System.out.println("CONTRASEÑA INCORRECTA, INTENTALO DE NUEVO");
            System.out.print("INGRESE LA CONTRASEÑA: ");
            XXX=sc.nextLine();
        }
        System.out.println("BIENVENIDO");
        
    }
}