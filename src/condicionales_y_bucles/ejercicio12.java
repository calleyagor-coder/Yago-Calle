package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int suma=0;
        for(int i=1; i<=100; i++){
            suma=suma+i;
        }
        System.out.println("la suma de los numeros del 1 al 100 es: "+suma);

    }
}