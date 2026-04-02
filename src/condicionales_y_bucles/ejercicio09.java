package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        int num=sc.nextInt();
        
        while(0>=num){
            System.out.print("ingrese un numero nuevamente: ");
            num=sc.nextInt();
        }
        System.out.println("oksoks");
        
    }
}