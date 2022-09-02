package test;

import org.junit.jupiter.api.Test;
import domain.AlgoritmosOrdenamiento;

/**
 *
 * @author galad
 */
public class OrdenamientoMergeTest {
    
    int[] datosAOrdenar = new int[7];
    
    public OrdenamientoMergeTest() {
        this.datosAOrdenar = new int[]{50,2,23,110,98,1,40};
    }
    
    @Test
    public void ordenar7(){
        
        System.out.println("Datos originales: ");
        for(int i=0; i<this.datosAOrdenar.length; i++){
            System.out.print(this.datosAOrdenar[i] + "  ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.mergeSort(datosAOrdenar);
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
    @Test
    public void ordenarVacio(){
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.mergeSort(new int[]{});
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
    @Test
    public void ordenar20(){
        
        int[] datos = new int[]{950,94,41,2,80,7,3,58,18,900,64,1,115,79,205,36,500,14,88,0};
        
        System.out.println("Datos originales: ");
        for(int i=0; i<datos.length; i++){
            System.out.print(datos[i] + "  ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.mergeSort(datos);
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
}
