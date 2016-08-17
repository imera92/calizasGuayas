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
public class ShellSort {
    public static void ordenacionShell(int[] v) {
        final int N = v.length;
        int incremento = N;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < N; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && v[j] < v[j - incremento]) {
                        int tmp = v[j];
                        v[j] = v[j - incremento];
                        v[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
    }
        public static long hacerShellSort(int[] v){
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        ShellSort.ordenacionShell(v);
        /*for(int i=0; i<v.length; i++)
        {
            System.out.println(v[i]);
        }*/
        time_end = System.currentTimeMillis();
        //System.out.println("SHELLSORT-the task has taken "+ ( time_end - time_start ) +" milliseconds");
        return ( time_end - time_start );
    }
}
