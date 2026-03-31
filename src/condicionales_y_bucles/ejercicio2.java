package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author LABO B 11
 */
public class ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        int num=sc.nextInt();
        
        if(num>0){
            System.out.println("numero positivo");
        }else if(num<0){
            System.out.println("numero negativo");
        }else{
            System.out.println("numero neutro");
        }

    }
}