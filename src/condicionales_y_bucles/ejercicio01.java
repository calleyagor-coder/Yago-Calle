package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();
        
        if(edad>=18){
            System.out.println("acceso permitido");}
        else{
        System.out.println("acceso denegado");
        }
        
        
        
    }
}