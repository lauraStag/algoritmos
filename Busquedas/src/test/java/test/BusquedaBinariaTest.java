package test;

import domain.Busquedas;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Laura Stagnaro
 */
public class BusquedaBinariaTest {

    int[] datos = new int[15];

    public BusquedaBinariaTest() {
        this.datos = new int[]{1,18,4,7,11,23,40,31,102,105,110,98,120,130,50};
    }
    
    @Test
    public void buscar1(){
        Busquedas.busquedaBinaria(this.datos, 1);
    }
    
    @Test
    public void buscar102(){
        Busquedas.busquedaBinaria(this.datos, 102);
    }
    
    @Test
    public void buscar11(){
        Busquedas.busquedaBinaria(this.datos, 11);
    }
    
    @Test
    public void buscar4(){
        Busquedas.busquedaBinaria(this.datos, 4);
    }
    
    @Test
    public void buscar23(){
        Busquedas.busquedaBinaria(this.datos, 23);
    }
    
    @Test
    public void buscar130(){
        Busquedas.busquedaBinaria(this.datos, 130);
    }
    
    @Test
    public void buscar10(){
        Busquedas.busquedaBinaria(this.datos, 10);
    }
    
    @Test
    public void buscarVacio(){
        Busquedas.busquedaBinaria(new int[0], 10);
    }
}
