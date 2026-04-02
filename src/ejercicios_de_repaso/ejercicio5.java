package ejercicios_de_repaso;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    
        System.out.println("ingrese su edad: ");
        int edad=sc.nextInt();
        
        if(edad>=16){
            System.out.println("tienes permiso de conducir");
        }else{
            System.out.println("no tienes permiso de conducir");
        }  
    }
}
