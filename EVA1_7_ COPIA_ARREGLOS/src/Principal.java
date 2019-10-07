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
        int aiCopia[];
        int aiDato[];
        aiDato = new int[10];
        aiCopia = new int[10];
        for(int i=0; i< aiDato.length; i++){
            aiDato[i]= (int)(Math.random()*100)+1;
                   
        }
        System.out.println("DATOS ORIGINALES");
        for(int i =0; i<aiDato.length; i++){
            System.out.print("["+aiDato[i]+"]");
    }
        System.out.println("DATOS COPIADOS");
        for(int i=0; i< aiDato.length; i++){
            aiDato[i]= (int)(Math.random()*100)+1;
                   
        }
        
    }
    
}
