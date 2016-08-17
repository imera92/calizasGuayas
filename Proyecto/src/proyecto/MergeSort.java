/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Arrays;

/**
 *
 * @author Joaquin Alban
 */
public class MergeSort {
    public static void ordenacionCombinacion(int[] v) {
        final int N = v.length;
        if(N<=1) return;
        int mitad=N/2;
        int[] izq = Arrays.copyOfRange(v, 0, mitad);
        int[] der = Arrays.copyOfRange(v, mitad, N);
        ordenacionCombinacion(izq);
        ordenacionCombinacion(der);
        combinar(v, izq, der);
    }
 
    public static void combinar(int[] resp, int[] izq, int[] der) {
        int i = 0;
        int j = 0;
        for(int k=0; k<resp.length;k++) {
            if(i>=izq.length) { resp[k]=der[j++]; continue; }
            if(j>=der.length) { resp[k]=izq[i++]; continue; }
            resp[k]=(izq[i]<der[j])?izq[i++]:der[j++];
        }
    }
    
    public static long hacerMergeSort(int[] v){
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        MergeSort.ordenacionCombinacion(v);
        /*for(int i=0; i<v.length; i++)
        {
            System.out.println(v[i]);
        }*/
        time_end = System.currentTimeMillis();
     //   System.out.println("MERGESORT-the task has taken "+ ( time_end - time_start ) +" milliseconds");
        return ( time_end - time_start );
    }
}
