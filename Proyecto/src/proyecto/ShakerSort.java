/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Joaquin Alban
 */
public class ShakerSort {
     public static void ordenacionShaker(int[] v) {
        final int N = v.length;
        int limInferior = 0;
        int limSuperior = N-1;
        while(limInferior <= limSuperior) {
            for(int j=limInferior; j<limSuperior; j++) {
                if(v[j]>v[j+1]) {
                    int tmp = v[j];
                    v[j]    = v[j+1];
                    v[j+1]  = tmp;
                }
            }
            limSuperior--;
            for(int j=limSuperior;j>limInferior; j--) {
                if(v[j]<v[j-1]) {
                    int tmp = v[j];
                    v[j]    = v[j-1];
                    v[j-1]  = tmp;
                }
            }
            limInferior++;
        }
    }
         public static long hacerShakerSort(int[] v){
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        ShakerSort.ordenacionShaker(v);
        /*for(int i=0; i<v.length; i++)
        {
            System.out.println(v[i]);
        }*/
        time_end = System.currentTimeMillis();
        //System.out.println("SHAKERSORT-the task has taken "+ ( time_end - time_start ) +" milliseconds");
        return ( time_end - time_start );
    }
}
