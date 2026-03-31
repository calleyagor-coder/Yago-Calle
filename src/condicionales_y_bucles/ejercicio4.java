package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author LABO B 11
 */
public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresa un numero: ");
        int num1=sc.nextInt();
        System.out.println("ingresa el segundo numero: ");
        int num2=sc.nextInt();
        System.out.println("ingresa el tercer numero: ");
        int num3=sc.nextInt();
        
        if(num1>num2&&num1>num3){
            System.out.println("el numero mayor es "+num1);
        }else if(num2>num1&&num2>num3){
            System.out.println("el numero mayor es "+num2);
        }else if(num3>num1&&num3>num2){
            System.out.println("el numero mayor es "+num3);
        }else{
            System.out.println("los 3 numeros son iguales");
        }
        
    }
}