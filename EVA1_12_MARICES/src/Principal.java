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
        int aMatriz[][] = new int[3][5];
        //FOR ANIDADO
        for (int i = 0; i < aMatriz.length; i++) {//FILAS
            for (int j = 0; j < aMatriz[i].length; j++) {//COLUMNAS
                aMatriz[i][j] = (int)(Math.random()*100);
            }
        }
        //IMRPIMIR LA MATRIZ
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
                System.out.print("["+ aMatriz[i][j]+"]");           
            }
            System.out.println("");
            
        }
    }
    
}
