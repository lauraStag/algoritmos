
import java.util.Arrays;

/**
 *
 * @author Laura Stagnaro
 */
public class AlgoritmosBusqueda {

    /**
     * Busqueda binaria en un arreglo de datos ordenados de menor a mayor
     * 
     * @param arregloOrdenado : el arreglo donde vamos a buscar un dato
     * @param toSearch : dato a buscar
     * @return true si el dato buscado existe en el arreglo, false si el dato buscado no existe en el arreglo
     */
    public static boolean busquedaBinaria(int[] arregloOrdenado, int toSearch) {
        
        //busco la posición del medio
        int middleIndex = arregloOrdenado.length/2;
        int lowerIndex = 0;
        int upperIndex = arregloOrdenado.length;
        
        //si indice menor es mayor que el indice mayor, entonces el dato no se encuentra en el arreglo
        if (lowerIndex > upperIndex) {
            return false;
        }
        
        //si encuentro el dato buscado termino el método
        if(arregloOrdenado[middleIndex] == toSearch){
            return true;
        }
        
        if (arregloOrdenado[middleIndex] < toSearch) {
            //si el dato buscado es mayor al dato del medio, tengo que seguir buscando en el 
            //sub-arreglo de la derecha
            return busquedaBinaria(Arrays.copyOfRange(arregloOrdenado, middleIndex+1, upperIndex), toSearch);
        }else{
            //si el dato buscado es menor al dato del medio, tengo que seguir buscando en el 
            //sub-arreglo de la izquierda
            return busquedaBinaria(Arrays.copyOfRange(arregloOrdenado, lowerIndex, middleIndex-1), toSearch);
        }
    }
}
