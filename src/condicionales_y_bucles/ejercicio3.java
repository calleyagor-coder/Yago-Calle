package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author LABO B 11
 */
public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese una nota del 0 al 10: ");
        int nota=sc.nextInt();
        
        if(nota==9 || nota==10){
            System.out.println("exelente");
        }else if(nota==8 || nota ==7){
            System.out.println("aprobado");
        }else if(nota==4 || nota==5 || nota==6){
            System.out.println("recupera");
        }else if(nota==0 || nota==1 || nota==2 || nota==3){
            System.out.println("desaprobado");
        }
        
    }
}