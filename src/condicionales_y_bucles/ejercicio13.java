package condicionales_y_bucles;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Yago
 */
public class ejercicio13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        
        int random=rm.nextInt(10)+1;
        int num;
        
        do{
            System.out.println("adivina un numero del 1 al 10: ");
            num=sc.nextInt();
            if(num==random){
                System.out.println("ADIVINASTEEE");
            }
        }while(num!=random);
        
    }
}