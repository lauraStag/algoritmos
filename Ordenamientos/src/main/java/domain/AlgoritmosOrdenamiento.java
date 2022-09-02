package domain;

import java.util.Arrays;

/**
 *
 * @author Laura Stagnaro
 */
public class AlgoritmosOrdenamiento {
    
    public int[] mergeSort(int[] arreglo){
        int[] arregloOrdenado = new int[arreglo.length];
        int pos = 0;
        
        int middleIndex = (arreglo.length-1)/2;
        
        int[] arrIzquierdo = mergeSort(Arrays.copyOfRange(arreglo, 0, middleIndex));
        int[] arrDerecho = mergeSort(Arrays.copyOfRange(arreglo, middleIndex + 1, arreglo.length-1));
        
        
        int j = 0;
        for(int i=0; i < arrIzquierdo.length; i++){
            int datoIzq = arrIzquierdo[i];
            while(j < arrDerecho.length && datoIzq > arrDerecho[j]){
                arregloOrdenado[pos++] = arrDerecho[j];
                j++;
            }
            arregloOrdenado[pos++] = datoIzq;
        }
        
        return arregloOrdenado;
    }
}
