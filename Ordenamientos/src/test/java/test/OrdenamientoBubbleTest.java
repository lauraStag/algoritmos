package test;

import domain.AlgoritmosOrdenamiento;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Laura Stagnaro
 */
public class OrdenamientoBubbleTest {
    int[] datos;
            
    public OrdenamientoBubbleTest() {
        this.datos = new int[]{50,2,23,110,98,1,40};
    }
    
    @Test
    public void ordenar7(){
        
        System.out.println("\nPrueba ordenar7\nDatos a ordenar: ");
        for(int i=0; i < this.datos.length; i++){
            System.out.print(this.datos[i] + " ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.bubbleSort(this.datos);
        
        System.out.println("\nDatos ordenados: ");
        for(int i=0; i < datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + " ");
        }
    }
    
    @Test
    public void ordenarVacio(){
        
        System.out.println("\nPrueba ordenarVacio\n ");
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.bubbleSort(new int[]{});
        
        System.out.println("\nDatos ordenados: ");
        for(int i=0; i < datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + " ");
        }
    }
    
    @Test
    public void ordenar20(){
        
        int[] datosAOrdenar = new int[]{150,94,41,2,80,7,3,58,18,900,64,1,115,79,205,36,500,14,88,3};
        System.out.println("\nPrueba ordenar7\nDatos a ordenar: ");
        for(int i=0; i < datosAOrdenar.length; i++){
            System.out.print(datosAOrdenar[i] + " ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.bubbleSort(datosAOrdenar);
        
        System.out.println("\nDatos ordenados: ");
        for(int i=0; i < datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + " ");
        }
    }
}
