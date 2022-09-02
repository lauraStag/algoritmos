package domain;

import java.util.Arrays;

/**
 * 
 * @author Laura Stagnaro
 */
public class AlgoritmosOrdenamiento {
    
    /**
     * Ordena un arreglo de enteros dividiendolo en dos sub-arreglos, para ordenar
     * ambos de forma recursiva, y luego combina ambos sub-arreglos para formar
     * el arreglo final, completamente ordenado de menor a mayor.
     * 
     * @param arreglo de enteros 
     * @return 
     */
    public static int[] mergeSort(int[] arreglo){
        //si el arreglo entra vacío no tiene sentido seguir
        if(arreglo.length == 0){
            System.out.println("El arreglo esta vacio.");
            return arreglo;
        }
        
        //creo el arreglo donde se guardarán los datos ordenados
        int[] arregloOrdenado = new int[arreglo.length];
        //la posicion del indice cuando vaya insertando los datos
        int pos = 0;
        
        //si el arreglo tiene un solo numero
        if(arreglo.length == 1){
            arregloOrdenado = arreglo;
            return arregloOrdenado;
        }
        
        //creo los arreglos para ambas partes
        int[] arrIzquierdo;
        int[] arrDerecho;
        
        //calculo el indice del medio
        int middleIndex = (arreglo.length-1)/2;
        
        //llamada recursiva para el lado izquierdo
        if(middleIndex != 0)
            arrIzquierdo = mergeSort(Arrays.copyOfRange(arreglo, 0, middleIndex));
        else{
            arrIzquierdo = new int[1];
            arrIzquierdo[pos] = arreglo[middleIndex];
        }
        
        //llamada recursiva para el lado derecho
        if(middleIndex != arreglo.length-1)
            arrDerecho = mergeSort(Arrays.copyOfRange(arreglo, (middleIndex==0?middleIndex+1:middleIndex), arreglo.length));
        else{
            arrDerecho = new int[1];
            arrDerecho[pos] = arreglo[middleIndex];
        }
        
        //recorro los sub-arreglos ordenados y agrego los datos en orden al arreglo final
        int j = 0;
        for(int i=0; i < arrIzquierdo.length; i++){
            int datoIzq = arrIzquierdo[i];
            while(j < arrDerecho.length && datoIzq > arrDerecho[j]){
                arregloOrdenado[pos++] = arrDerecho[j];
                j++;
            }
            arregloOrdenado[pos++] = datoIzq;
        }
        
        //si quedaron datos en el sub-arreglo de la derecha por guardar
        while(j < arrDerecho.length){
            arregloOrdenado[pos++] = arrDerecho[j];
            j++;
        }
        
        return arregloOrdenado;
    }
    
    /**
     * Se toma el primer valor del arreglo y se compara con todos los demás,
     * colocando los menores en un arreglo-izquierda y los mayores en un arreglo-derecha.
     * De forma recursiva se vuelve a ejecutar el método para cada uno de esos arreglos.
     * Se unen los arreglos ya ordenados.
     * 
     * @param arreglo a ser ordenado
     * @return 
     */
    public static int[] mergeQuick(int[] arreglo){
        
        //si el arreglo está vacio, no tiene sentido seguir
        if(arreglo.length == 0){
            System.out.println("El arreglo está vacío.");
            return arreglo;
        }
        
        //si tiene un solo elemento, ya está ordenado
        if(arreglo.length == 1){
            return arreglo;
        }
        
        //creo el arreglo que se devolvera ordenado
        int arregloOrdenado[] = new int[arreglo.length];
        int posOrd = 0;
        int pivot = 0;
        
        //creo los arreglos auxiliares
        int arrIzquierda[] = new int[arreglo.length];
        int posIzq = 0;
        int arrDerecha[] = new int[arreglo.length];
        int posDer = 0;
        
        for(int i=1; i < arreglo.length; i++){
            if(arreglo[pivot] > arreglo[i]){
                //agrego el dato al arreglo de la izquierda
                arrIzquierda[posIzq++] = arreglo[i];
            }else{
                //agrego el dato al arreglo de la derecha
                arrDerecha[posDer++] = arreglo[i];
            }
        }
        arrIzquierda = Arrays.copyOf(arrIzquierda, posIzq);
        arrDerecha = Arrays.copyOf(arrDerecha, posDer);
        
        //llamo de nuevo el metodo para los 2 nuevos arreglos
        arrIzquierda = arrIzquierda.length>0?mergeQuick(arrIzquierda):arrIzquierda;
        arrDerecha = arrDerecha.length>0?mergeQuick(arrDerecha):arrDerecha;
        
        //inserto todos los valores ordenados en el arreglo a devolver
        for(int i=0; i < arrIzquierda.length; i++){
            arregloOrdenado[posOrd++] = arrIzquierda[i];
        }
        arregloOrdenado[posOrd++] = arreglo[pivot];
        for(int i=0; i < arrDerecha.length; i++){
            arregloOrdenado[posOrd++] = arrDerecha[i];
        }
        
        return arregloOrdenado;
    }
}
