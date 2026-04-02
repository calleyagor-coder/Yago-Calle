package condicionales_y_bucles;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class ejercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el primer num: ");
        double num1=sc.nextDouble();
        System.out.println("ingrese el segundo num: ");
        double num2=sc.nextDouble();
        System.out.println("ingrese que operación se realizara(+,-,*,/): ");
        char ope=sc.next().charAt(0);
        
        double resul=0;
        
        switch(ope){
            case '+':
                resul=num1+num2;
                System.out.println(num1+"+"+num2+"= "+resul);
                break;
            case '-':
                resul=num1-num2;
                System.out.println(num1+"-"+num2+"= "+resul);
                break;
            case '*':
                resul= num1*num2;
                System.out.println(num1+"X"+num2+"= "+resul);
                break;
            case '/':
                resul=num1/num2;
                System.out.println(num1+"/"+num2+"= "+resul);
                break;
        }
                
    }
}