/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLO DE DOS DIMENSIONES, MATRIZ
        int aDatos[][] = new int [3][5]; //tenemos 9 enteros 
        System.out.println("Direcciones de arreglo: "+aDatos);
        System.out.println("Tamaño del arreglo: "+aDatos.length);
        
        System.out.println("Direcciones de arreglo[0]: "+aDatos[0]);
        System.out.println("Tamaño del arreglo[0] "+aDatos[0].length);
        
        System.out.println("Valor de la posicion a Datos[0][0]: "+aDatos[0][0]);// ya no se usa length porque ya no es un arreglo
        
       
    }
    
}
