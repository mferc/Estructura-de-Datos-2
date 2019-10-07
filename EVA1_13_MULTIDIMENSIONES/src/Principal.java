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
        int aMatriz[][][][][] = new int[2][3][4][5][6];
        //UN FOR POR CADA DIMENSION, FOR ANIDADO
        for (int i = 0; i < aMatriz.length; i++) {//FILAS
            for (int j = 0; j < aMatriz[i].length; j++) {//COLUMNAS
                for (int k = 0; k < aMatriz[i][j].length; k++) {
                    for (int l = 0; l < aMatriz[i][j][k].length; l++) {
                        for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {
                            aMatriz[i][j][k][l][m] = (int)(Math.random()*8000);
                        }
                        
                    }
                    
                }
            }
            
        }
        
    }
    
}
