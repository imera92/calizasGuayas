
package Clases;

import java.util.Scanner;

/**
 *
 * @author RyoSuke
 */
public class Exponenciacion {   
    
    public long Exponenciacion(long base,long exponente){
        if(exponente==1)
            return base;
        else if(exponente%2==0)
            return Exponenciacion(base, exponente/2)*Exponenciacion(base, exponente/2);
        else
            return base*Exponenciacion(base, exponente-1);
        
    }
    
    public static void main(String args[]){
        Exponenciacion ex=new Exponenciacion();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese Base ");
        int x=leer.nextInt();
        System.out.println("Ingrese Exponente ");
        int y=leer.nextInt();
        System.out.println(" Rpta : "+ex.Exponenciacion(x, y));        
    }
}
