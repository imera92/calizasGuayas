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
public class PigeonHoleSort {

    public static void pegionholeSort(int arr[],int n){
        int min = arr[0];
        int max = arr[0];
        
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max)
                max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        
        int range = max - min + 1;
        int[] phole = new int[range];
        Arrays.fill(phole,0);
        
        for(int i=0 ; i<n ; i++)
            phole[arr[i]-min]++;
            
        int index=0;    
        for(int i=0 ; i<range ; i++)
            while(phole[i]-->0)
                arr[index++] = i+min;
        
    }
  public static long hacerPigeonHoleSort(int arr[],int n){
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        PigeonHoleSort.pegionholeSort(arr, n);
       /* for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }*/
        time_end = System.currentTimeMillis();
      //  System.out.println("QUICKSORT-the task has taken "+ ( time_end - time_start ) +" milliseconds");
        return ( time_end - time_start );
    }
}

