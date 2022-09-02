package test;

import domain.AlgoritmosOrdenamiento;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Laura Stagnaro
 */
public class OrdenamientoQuickTest {
    
    int datosAOrdenar[];
            
    public OrdenamientoQuickTest() {
        this.datosAOrdenar = new int[]{50,2,23,110,98,1,40};
    }
    
    @Test
    public void ordenar7(){
        System.out.println("\nPrueba ordenar7\nDatos originales: ");
        for(int i=0; i<this.datosAOrdenar.length; i++){
            System.out.print(this.datosAOrdenar[i] + "  ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.mergeQuick(datosAOrdenar);
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
    @Test
    public void ordenarVacio(){
        
        System.out.println("\nPrueba ordenarVacio");
        
       int[] datosOrdenados = AlgoritmosOrdenamiento.mergeQuick(new int[]{});
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
    @Test
    public void ordenar20(){
        
        int[] datos = new int[]{150,94,41,2,80,7,3,58,18,900,64,1,115,79,205,36,500,14,88,3};
        
        System.out.println("\nPrueba ordenar20\n Datos originales: ");
        for(int i=0; i<datos.length; i++){
            System.out.print(datos[i] + "  ");
        }
        
        int[] datosOrdenados = AlgoritmosOrdenamiento.mergeQuick(datos);
        
        System.out.println("Datos ordenados: ");
        for(int i=0; i<datosOrdenados.length; i++){
            System.out.print(datosOrdenados[i] + "  ");
        }
    }
    
    
}
