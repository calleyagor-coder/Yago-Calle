package ejercicios_de_repaso;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.print("que gusto de helado busca: ");
        String gusto=sc.nextLine();

        if(gusto.equals("chocolate") || gusto.equals("vainilla") || gusto.equals("frutilla") || gusto.equals("dulce de leche")){
            System.out.println("si hay "+gusto); 
        }else{
            System.out.println("no hay "+gusto);
        }
    }
    
}
