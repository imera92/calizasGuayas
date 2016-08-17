/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
/**
 *
 * @author Lucrecia Vintimilla
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODOcode application logic here
       
        float atmerge=0, atquick=0, atheap=0, atshell=0, atshaker=0, atpigeon=0;
        for (int j=0; j<=10; j++){
            int [ ] A=DatosNecesarios.llenarArrayAleatorio(0, 20, 100000);
            MergeSort merge=new MergeSort();
            QuickSort quick= new QuickSort();
            HeapSort heap= new HeapSort();
            ShellSort shell= new ShellSort();
            ShakerSort shaker= new ShakerSort();
            PigeonHoleSort pig=new PigeonHoleSort();
        
            float tmerge=merge.hacerMergeSort(A);
            float tquick= quick.hacerQuickSort(A, 0, A.length-1);
            float theap=heap.hacerHeapSort(A);
            float tshell=shell.hacerShellSort(A);
            float tshaker=shaker.hacerShakerSort(A);
            float tpigeon=pig.hacerPigeonHoleSort(A, A.length);
            
            atmerge=DatosNecesarios.acumularTiempo(atmerge, tmerge);
            atquick=DatosNecesarios.acumularTiempo(atquick, tquick);
            atheap=DatosNecesarios.acumularTiempo(atheap, theap);
            atshell=DatosNecesarios.acumularTiempo(atshell, tshell);
            atshaker=DatosNecesarios.acumularTiempo(atshaker, tshaker);
            atpigeon=DatosNecesarios.acumularTiempo(atpigeon, tpigeon);
            
        }
        System.out.println("MERGESORT\n");
        DatosNecesarios.promediarTiempo(atmerge, 10);
        System.out.println("QUICKSORT\n");
        DatosNecesarios.promediarTiempo(atquick, 10);
        System.out.println("HEAPSORT\n");
        DatosNecesarios.promediarTiempo(atheap, 10);
        System.out.println("SHELLSORT\n");
        DatosNecesarios.promediarTiempo(atshell, 10);
        System.out.println("SHAKERSORT\n");
        DatosNecesarios.promediarTiempo(atshaker, 10);
        System.out.println("PIGEONHOLESORT\n");
        DatosNecesarios.promediarTiempo(atpigeon, 10);
    }
               
}
