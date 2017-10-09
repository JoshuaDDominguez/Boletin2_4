
package boletin2_4;

import java.util.Scanner;
public class Boletin2_4 {

    
    public static void main(String[] args) {
        
        float num1,num2,suma,rest,prod,coci;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num1=sc.nextFloat();
        System.out.println("Introduzca el segundo numero");
        num2=sc.nextFloat();
        suma=num1+num2;
        rest=num1-num2;
        prod=num1*num2;
        coci=num1/num2;
        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+rest);
        System.out.println(num1+" * "+num2+" = "+prod);
        System.out.println(num1+" / "+num2+" = "+coci);
    }
    
}
