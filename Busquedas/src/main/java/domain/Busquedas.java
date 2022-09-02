package domain;


import java.util.Arrays;

/**
 *
 * @author Laura Stagnaro
 */
public class Busquedas {

    /**
     * Busqueda binaria en un arreglo de datos ordenados de menor a mayor
     * 
     * @param datos : el arreglo donde vamos a buscar un dato
     * @param toSearch : dato a buscar
     * @return true si el dato buscado existe en el arreglo, false si el dato buscado no existe en el arreglo
     */
    public static boolean busquedaBinaria(int[] datos, int toSearch) {
        
        //si indice menor es mayor que el indice mayor, entonces el dato no se encuentra en el arreglo
        if (datos.length == 0) {
            System.out.println("El arreglo se encuentra vacío.");
            return false;
        }
        
        //ordeno el arreglo que viene por parametro
        Arrays.sort(datos);
        
        int lowerIndex = 0;
        int upperIndex = datos.length-1;
        int middleIndex;
        
        while(lowerIndex <= upperIndex){
            //busco la posición del medio
            middleIndex = (upperIndex+lowerIndex)/2;
            //si encuentro el dato buscado termino el método
            if(datos[middleIndex] == toSearch){
                System.out.println("El dato buscado '" + toSearch + "' existe en el arreglo.");
                return true;
            }else if (datos[middleIndex] < toSearch) {
                //si el dato buscado es mayor al dato del medio, tengo que seguir buscando en el 
                //sub-arreglo de la derecha
                lowerIndex = middleIndex + 1;
            }else{
                //si el dato buscado es menor al dato del medio, tengo que seguir buscando en el 
                //sub-arreglo de la izquierda
                upperIndex = middleIndex - 1;
            }
        }
        
        System.out.println("El dato buscado '" + toSearch + "' NO se encuentra en el arreglo.");
        return false;

    }
}
