package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("que tabla de multiplicar quieres ver?: ");
        int num=sc.nextInt();
        
        System.out.println("TABLA DEL "+num);
        System.out.println("-----------");
        
        for(int i=1; i<=10; i++){
            int resul=num*i;
            System.out.println(num+"x"+i+"= "+resul);
        }
    }
}