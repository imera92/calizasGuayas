/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Random;

/**
 *
 * @author Joaquin Alban
 */
public class DatosNecesarios {
    
    public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
        }
        return numeros;
        
    }
    
    public static float acumularTiempo(float acum,float tiempo){
        acum=acum+tiempo;
        return acum;
    }
    
    public static void promediarTiempo(float tiempoAcumulado, int nveces){
        float promedio=tiempoAcumulado/nveces;
        System.out.println("El tiempo promedio es: "+promedio+" milisegundos \n");
        
    }    
}
