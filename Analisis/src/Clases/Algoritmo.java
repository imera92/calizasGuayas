/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfacez.Principal;
import javax.swing.JProgressBar;

/**
 *
 * @author Tottus
 */
public class Algoritmo {
    
    Object[] Elementos;
    
      Principal p=new Principal();
      JProgressBar pro;
      
      
    public Algoritmo() {
        
    }
    
    public Algoritmo(Object[] Elementos) {
        this.Elementos = Elementos;
    }
    
    
    public int pivote(Object arr[], int inicio, int fin) {
          int i = inicio, j = fin;
          int tmp;
          int pivot = ((Integer)(arr[(inicio + fin) / 2]));
//          System.out.println("pivot : "+pivot);
          while (i <= j) {
                while ((Integer)arr[i]<pivot)
//                    System.out.println("Es menor Que pivot "+(int)arr[i]+" no");
                      i++;
                while ((Integer)arr[j]>pivot)
//                    System.out.println("Es mayor Que pivot "+(int)arr[j]+" no");
                      j--;
                
                if (i <= j) {
                      tmp = (Integer)arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
//                      System.out.println("Intercambiamos valores "+arr[i]+" con"+arr[j]);
                      i++;
                      j--;
                }
          }
//          System.out.println("retornamos "+i);
          return i;
    }

    public void quickSort(Object arr[], int inicio, int fin) {
          int index = pivote(arr, inicio, fin);
//          System.out.println("Almacenar el pivot con los valores "+"("+arr+","+inicio+","+fin+")"+" obteniendo "+index);
          if (inicio < index - 1)
                quickSort(arr, inicio, index - 1);
//                System.out.println("Regresamos al metodorecursivo con los valores "+arr+""+inicio+""+(index-1)+"\n--si es q "+inicio+" es menor q "+(index-1));
          if (index < fin)
                quickSort(arr, index, fin);
//                System.out.println("Regresamos al metodorecursivo con los valores "+arr+""+index+""+(fin)+"\n--si es q "+index+" es menor q "+(fin));
          
    }
    
    private void merge(Object[ ] data, int first, int n1, int n2)
        {     int[ ] temp = new int[n1+n2];
              int copied  = 0;
              int copied1 = 0;
              int copied2 = 0;
              int i;
              while ((copied1 < n1) && (copied2 < n2))
              {
                 if ((Integer)data[first + copied1] < (Integer)data[first + n1 + copied2])
                    temp[copied++] = (Integer)data[first + (copied1++)];
                 else
                    temp[copied++] = (Integer)data[first + n1 + (copied2++)];
              }
              while (copied1 < n1)
                 temp[copied++] = (Integer)data[first + (copied1++)];
              while (copied2 < n2)
                 temp[copied++] = (Integer)data[first + n1 + (copied2++)];
              for (i = 0; i < n1+n2; i++)
                 data[first + i] = temp[i];
        }
    public void mergesort(Object[ ] data, int first, int n)
        {   int n1; 
            int n2; 
            if (n > 1)
            {    n1 = n / 2;
                 n2 = n - n1;
                 mergesort(data, first, n1);      
                 mergesort(data, first + n1, n2); 
                 merge(data, first, n1, n2);
            }
        }
    
  
       
   public  Object[] shellSort( Object array[]){
       for( int q = array.length / 2; q > 0; q = (q == 2 ? 1 : (int) (q/2.2)) ){
           for( int i = q; i<array.length; i++ ){
               int tmp;
               tmp = Integer.parseInt(array[i].toString());
               int j;
                   for(j = i; j >= q && tmp <(Integer.parseInt(array[j-q].toString())) ; j -= q ){
                     array[j] = (Object)array[j-q];
                    }
               array[j] = tmp;
           }
       }
       return array;
}
   
    
    
    public Object[] getElementos() {
        return Elementos;
    }

    public void setElementos(String[] Elementos) {
        this.Elementos = Elementos;
    }
    
}
